package Vistor;

import Utils.ReturnObj;
import Utils.Scope;
import gen.CMMBaseVisitor;
import gen.CMMParser;

/**
 * Created by ZXG on 2016/12/20.
 * if语句
 * 对于表达式的返回值，0代表false 非零数代表true
 */
public class IfVisitor extends CMMBaseVisitor<ReturnObj> {
    Scope scope;
    public void setParentScope(Scope parent){
        scope =new Scope(parent);
    }
    @Override
    public ReturnObj visitIfStmt(CMMParser.IfStmtContext ctx){
        ExprVisitor exprVisitor=new ExprVisitor();
        exprVisitor.setParentScope(this.scope);
        ReturnObj returnOb=exprVisitor.visit(ctx.expr());
        if(!(returnOb.getValue().equals("0"))){
            StmtVisitor vistor=new StmtVisitor();
            vistor.setParentScope(this.scope);
            ReturnObj result=vistor.visit(ctx.stmt(0));
            return result;
        }else{
            //先要判断是否有else 字句
            if(ctx.stmt(1)!=null){
                StmtVisitor vistor=new StmtVisitor();
                vistor.setParentScope(this.scope);
                ReturnObj result=vistor.visit(ctx.stmt(1));
                return result;
            }
            return new ReturnObj();
        }
    }
}
