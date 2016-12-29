package Vistor;

import Utils.ReturnObj;
import Utils.Scope;
import gen.CMMBaseVisitor;
import gen.CMMParser;

/**
 * Created by ZXG on 2016/12/21.,
 */
public class WriteVisitor extends CMMBaseVisitor<ReturnObj>{
    Scope scope;
    public void setParentScope(Scope parent){
        scope =new Scope(parent);
    }
    @Override
    public ReturnObj visitWriteStmt(CMMParser.WriteStmtContext ctx){
        ExprVisitor visitor=new ExprVisitor();
        visitor.setParentScope(this.scope);
        ReturnObj result=visitor.visit(ctx.expr());
        if(result.getValue()!=null){
            System.out.println("值："+result.getValue());
        }
        return new ReturnObj();
    }
}
