import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.HashMap;
import java.util.Map;

public class CodeGenerator extends custom_grammarBaseVisitor<String> {
    StringBuilder final_code = new StringBuilder();
    int reg_cnt = 1;
    int label_cnt = 0;
    int tmp_cnt = 1;
    int current_reg = 1;

    Map<String, Integer> var_reg = new HashMap<>();
    public String getCode(){
        return final_code.toString();
    }

    @Override
    public String visitProgram(custom_grammarParser.ProgramContext ctx) {
        
        for (var stat : ctx.statement()){
            if (current_reg > 31){
                System.out.println("Программа не поддерживается");
                System.exit(1);
            }
            visitStatement(stat);
        }
        final_code.append("ebreak\n");
        return null; 
    }

    @Override 
    public String visitStatement(custom_grammarParser.StatementContext ctx) { 
        // куча ифов с посещениями
        
        if (ctx.var_decl() != null){
            //System.out.println("Its' vardecl");
            visitVar_decl(ctx.var_decl());
        }
        else if (ctx.if_state() != null){
            visitIf_state(ctx.if_state());
        }
        else if (ctx.assign() != null){
            visitAssign(ctx.assign());
        }
        else if (ctx.while_loop() != null){
            visitWhile_loop(ctx.while_loop());
        }
        else if (ctx.for_loop() != null){
            visitFor_loop(ctx.for_loop());
        }

        return null;
    }

    // ГОТОВО
    @Override 
    public String visitVar_decl(custom_grammarParser.Var_declContext ctx) { 
        // у нас всего 32 регистра, 1 минимум для операций,
        // т. е. нельзя, чтобы номер больше 30 был
        if (reg_cnt > 30){
            System.out.println("Слишком много переменных");
            System.exit(1);
        }
        
        if (var_reg.containsKey(ctx.ID().getText())){
            System.out.println("Имена переменных должны быть разными");
            System.exit(1);
        }
        var_reg.put(ctx.ID().getText(), reg_cnt);
        if (ctx.ASSIGN() != null){
            String expr_res = visitExpression(ctx.expression());
            final_code.append(String.format("li x%d, %s\n", reg_cnt, expr_res.trim()));
        }
        // если переменная просто объявлена, то код не генерируется
        reg_cnt += 1;
        current_reg += 1;
        return null; 
    }

    // ГОТОВО
    // подразумевается что все переменные объявлены
    @Override
    public String visitAssign(custom_grammarParser.AssignContext ctx) {
        int reg = var_reg.get(ctx.ID().getText());
        String expr_res = visit(ctx.expression());
        // нужный регистр, регистр с tmp
        final_code.append(String.format("addi x%d, x%s, 0\n", reg, expr_res.trim()));
        return null;
    }


    // ГОТОВО
    @Override 
    public String visitIf_state(custom_grammarParser.If_stateContext ctx) { 
        
        // условие if 
        final_code.append("#if\n");
        // для временных переменных
        current_reg = reg_cnt + 1;
        String expr_res = visitExpression(ctx.expression(0));

        // метки для if, elif и else
        String if_label = "label" + label_cnt++;
        String elif_label = ctx.ELIF() != null ? "label" + label_cnt++ : null;
        String else_label = ctx.ELSE() != null ? "label" + label_cnt++ : null;
        String end_label = "label" + label_cnt++;
        
        // переход если правда
        final_code.append(String.format("bne x%d, x0, %s\n", current_reg - 1, if_label));
      
        
        // условие elif
        if (elif_label != null) {
            final_code.append("#elif\n");
            current_reg = reg_cnt + 1;
            visitExpression(ctx.expression(1));
            final_code.append(String.format("bne x%d, x0, %s\n", current_reg  - 1, elif_label));
        }

        // счетчик блоков кода
        int blocks = 0;

        // ветка else
        if (else_label != null) {
            final_code.append("#else\n");
            current_reg = reg_cnt + 1;
            final_code.append(String.format("jal x0, %s\n", else_label));
        }

        // код блока if
        final_code.append(if_label+":\n");
        visitF_block(ctx.f_block(blocks));
        blocks += 1;
        final_code.append(String.format("jal x0, %s\n", end_label));

        // код блока elif
        if (elif_label != null) {
            final_code.append(elif_label+":\n");
            current_reg = reg_cnt + 1;
            visitF_block(ctx.f_block(blocks));
            blocks += 1;
            final_code.append(String.format("jal x0, %s\n", end_label));
        }

        // код блока else
        if (else_label != null){
            final_code.append(else_label+":\n");
            current_reg = reg_cnt + 1;
            visitF_block(ctx.f_block(blocks));
            blocks += 1;
            final_code.append(String.format("jal x0, %s\n", end_label));
        } 
        // конец if-elif-else
        final_code.append(String.format("%s:\n", end_label));
        current_reg = reg_cnt + 1;

        return null;


    }

    // ГОТОВО
    @Override 
    public String visitWhile_loop(custom_grammarParser.While_loopContext ctx) 
    { 
        // метки 
        String while_label = "label" + label_cnt++;
        String end_label = "label" + label_cnt++;
        final_code.append("#while\n"); 
        // условие цикла
        current_reg = reg_cnt + 1;
        visitExpression(ctx.expression());
        final_code.append(String.format("bne x%d, x0, %s\n", current_reg - 1, while_label));
        
        // код блока
        final_code.append(while_label+":\n");
        visitF_block(ctx.f_block());
        visitExpression(ctx.expression());
        final_code.append(String.format("beq x%d, x0, %s\n", current_reg - 1, end_label));
        final_code.append(String.format("jal x0, %s\n", while_label));

        final_code.append(String.format("%s:\n", end_label));
        current_reg = reg_cnt + 1;

        return null;
    }

    // ГОТОВО
    @Override public String visitFor_loop(custom_grammarParser.For_loopContext ctx) { 
        // метки 
        String for_label = "label" + label_cnt++;
        String end_label = "label" + label_cnt++;
        final_code.append("#for\n"); 

        visitAssign(ctx.assign(0));
        visitExpression(ctx.expression());
        final_code.append(String.format("bne x%d, x0, %s\n", current_reg - 1, for_label));

        // код блока
        final_code.append(for_label+":\n");
        visitF_block(ctx.f_block());

        // шаг цикла
        visitAssign(ctx.assign(1));

        // проверка условия
        visitExpression(ctx.expression());
        final_code.append(String.format("beq x%d, x0, %s\n", current_reg - 1, end_label));

        
        final_code.append(String.format("jal x0, %s\n", for_label));
        
        final_code.append(String.format("%s:\n", end_label));
        current_reg = reg_cnt + 1;
        return null;
    }

    
    // ГОТОВО
    @Override public String visitF_block(custom_grammarParser.F_blockContext ctx) { 
        if (ctx.L_SQ() != null && ctx.R_SQ() != null){
            int i = 0;
            while (ctx.statement(i) != null){
                visitStatement(ctx.statement(i));
                i++;
            }
             
        }
        return null;
    }


   @Override
    public String visitExpression(custom_grammarParser.ExpressionContext ctx) {
        if (ctx.NUMBER() != null) {
            // число
            int reg = current_reg;
            if (!var_reg.values().contains(reg)) {
                reg = current_reg++;
                final_code.append(String.format("li x%d, %s\n", reg, ctx.NUMBER().getText()));
                return String.valueOf(reg);
            }
            return ctx.NUMBER().getText();
            
        } else if (ctx.ID() != null) {
            // имя переменной
            String varName = ctx.ID().getText();
            if (!var_reg.containsKey(varName)) {
                throw new RuntimeException("переменная " + varName + " не объявлена.");
            }
            int reg = current_reg++;
            // загрузка во временный регистр значения
            final_code.append(String.format("addi x%d, x%d, 0\n", reg, var_reg.get(varName)));
            return String.valueOf(reg);
        } else if (ctx.BOOL_VALUE() != null) {
            // логическое
            int reg = current_reg++;
            int value = ctx.BOOL_VALUE().getText().equals("true") ? 1 : 0;
            final_code.append(String.format("li x%d, %d\n", reg, value));
            return String.valueOf(reg);
        } else if (ctx.NOT() != null) {
            // отрицание
            int exprReg = Integer.parseInt(visitExpression(ctx.expression(0)));
            int reg = current_reg++;
            final_code.append(String.format("xori x%d, x%d, 1\n", reg, exprReg));
            return String.valueOf(reg);
        } else if (ctx.L_ROUND() != null && ctx.R_ROUND() != null) {
            // выражения в скобках
            return visitExpression(ctx.expression(0));
        } else if (ctx.PLUS() != null || ctx.MINUS() != null ||
                ctx.MULT() != null || ctx.DIV() != null || ctx.MOD() != null) {
            // обработка арифметических операций
            int leftReg = Integer.parseInt(visitExpression(ctx.expression(0)));
            int rightReg = Integer.parseInt(visitExpression(ctx.expression(1)));
            int reg = current_reg++;

            if (ctx.PLUS() != null) {
                final_code.append(String.format("add x%d, x%d, x%d\n", reg, leftReg, rightReg));
            } else if (ctx.MINUS() != null) {
                final_code.append(String.format("sub x%d, x%d, x%d\n", reg, leftReg, rightReg));
            } else if (ctx.MULT() != null) {
                final_code.append(String.format("mul x%d, x%d, x%d\n", reg, leftReg, rightReg));
            } else if (ctx.DIV() != null) {
                final_code.append(String.format("div x%d, x%d, x%d\n", reg, leftReg, rightReg));
            } else if (ctx.MOD() != null) {
                final_code.append(String.format("rem x%d, x%d, x%d\n", reg, leftReg, rightReg));
            }
            return String.valueOf(reg);
        } else if (ctx.LESS() != null ||
                ctx.GEQ() != null || ctx.EQ() != null || ctx.NEQ() != null) {
            // сравнения
            int leftReg = Integer.parseInt(visitExpression(ctx.expression(0)));
            int rightReg = Integer.parseInt(visitExpression(ctx.expression(1)));
            int reg = current_reg++;

            if (ctx.LESS() != null) {
                final_code.append(String.format("slt x%d, x%d, x%d\n", reg, leftReg, rightReg));
            } else if (ctx.GEQ() != null) {
                final_code.append(String.format("sge x%d, x%d, x%d\n", reg, leftReg, rightReg));
            } else if (ctx.EQ() != null) {
                final_code.append(String.format("seq x%d, x%d, x%d\n", reg, leftReg, rightReg));
            } else if (ctx.NEQ() != null) {
                final_code.append(String.format("sne x%d, x%d, x%d\n", reg, leftReg, rightReg));
            }
            return String.valueOf(reg);
        } else if (ctx.AND() != null || ctx.OR() != null) {
            //  AND/OR
            int leftReg = Integer.parseInt(visitExpression(ctx.expression(0)));
            int rightReg = Integer.parseInt(visitExpression(ctx.expression(1)));
            int reg = current_reg++;

            if (ctx.AND() != null) {
                final_code.append(String.format("and x%d, x%d, x%d\n", reg, leftReg, rightReg));
            } else if (ctx.OR() != null) {
                final_code.append(String.format("or x%d, x%d, x%d\n", reg, leftReg, rightReg));
            }
            return String.valueOf(reg);
        }
        throw new UnsupportedOperationException("Неизвестное выражение.");
    }



}