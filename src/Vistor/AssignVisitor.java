package Vistor;

import Utils.Macro;
import Utils.ReturnObj;
import Utils.Scope;
import gen.CMMBaseVisitor;
import gen.CMMParser;

/**
 * Created by ZXG on 2016/12/21.
 * 赋值语句
 */
public class AssignVisitor extends CMMBaseVisitor<ReturnObj>{
    Scope scope =new Scope();
    public void setParentScope(Scope parent){
        scope.setParent(parent);
    }
    @Override
    public ReturnObj visitAssignStmt(CMMParser.AssignStmtContext ctx){
        //赋值语句没有自己的作用域，所以变量是从其父作用域中找。
        //获取变量
        ctx.value().getText();
        ValVisitor visitor=new ValVisitor();
        visitor.setParentScope(this.scope);
        ReturnObj val=visitor.visit(ctx.value());
        //获取值
        ExprVisitor visitor1=new ExprVisitor();
        visitor1.setParentScope(this.scope);
        //还要再判断一下是否返回了值，不然赋值会出错。
        ReturnObj value=visitor1.visit(ctx.expr());
        value.getValue();

        if(val.getType()!=Macro.NOTDECLARED) {
            if(val.getType()== Macro.INTCONST){
                scope.setValue(ctx.value().getText(),String.valueOf(Double.valueOf(value.getValue()).intValue()));
            }else if(val.getType()==Macro.DOUBLECONST){
                scope.setValue(ctx.value().getText(),String.valueOf(Double.valueOf(value.getValue()).doubleValue()));
            }
            else if(val.getType()==Macro.INTARR){
                scope.setValue(val.getName(),val.getIndex(),String.valueOf(Double.valueOf(value.getValue()).intValue()));
            }else if(val.getType()==Macro.DOUBLEARR){
                scope.setValue(val.getName(),val.getIndex(),String.valueOf(Double.valueOf(value.getValue()).doubleValue()));
            }else if(val.getType()==Macro.OutOfBounds){
                System.out.println("Error:line"+val.getLine()+" 数组访问越界");
            }
        }else{
            System.out.println("Error:line"+val.getLine()+" 变量 "+val.getName()+" 没有被声明");
        }
        return  new ReturnObj();
    }
}
