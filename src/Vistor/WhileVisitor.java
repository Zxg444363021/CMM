package Vistor;

import Utils.Macro;
import Utils.ReturnObj;
import Utils.Scope;
import gen.CMMBaseVisitor;
import gen.CMMParser;

/**
 * Created by ZXG on 2016/12/22.
 */
public class WhileVisitor extends CMMBaseVisitor<ReturnObj> {
    Scope scope;
    public void setParentScope(Scope parent){
        this.scope=new Scope(parent);
    }

    @Override
    public ReturnObj visitWhileStmt(CMMParser.WhileStmtContext ctx){
        //每次执行都要判断
        ExprVisitor exprVisitor=new ExprVisitor();
        exprVisitor.setParentScope(this.scope);
        while(Double.valueOf(exprVisitor.visit(ctx.expr()).getValue())!=0){
            StmtVisitor visitor=new StmtVisitor();
            visitor.setParentScope(this.scope);
            ReturnObj result=visitor.visit(ctx.stmt());
            //如果visit了break语句，就跳出循环。
            if(result.getType()== Macro.IFBREAK){
                break;
            }
        }
        return new ReturnObj();
    }


}
