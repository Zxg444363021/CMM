package Vistor;

import Utils.ReturnObj;
import Utils.Scope;
import gen.CMMBaseVisitor;
import gen.CMMParser;

import java.util.ArrayList;

/**
 * Created by ZXG on 2016/12/21.
 */
public class VarListVisitor extends CMMBaseVisitor<ArrayList<ReturnObj>> {
    Scope scope;
    public void setParentScope(Scope parent){
        scope =new Scope(parent);}
    //解析varList中声明的变量名，及赋予它的值
    @Override
    public ArrayList<ReturnObj> visitNoValue(CMMParser.NoValueContext ctx){

        ArrayList<ReturnObj> varList=new ArrayList<>();
        for(int i=0;i<ctx.ID().size();i++){
            ReturnObj result=new ReturnObj();
            result.setName(ctx.ID(i).getText());
            result.setLine(ctx.ID(i).getSymbol().getLine());
            varList.add(result);
        }
        return varList;
    }
    @Override
    public ArrayList<ReturnObj> visitHasValue(CMMParser.HasValueContext ctx){

        ArrayList<ReturnObj> varList=new ArrayList<>();
        for(int i=0;i<ctx.ID().size();i++){
            ExprVisitor visitor=new ExprVisitor();
            visitor.setParentScope(this.scope);
            ReturnObj value=visitor.visit(ctx.expr(i));
            ReturnObj result=new ReturnObj();
            result.setName(ctx.ID(i).getText());
            result.setValue(value.getValue());
            result.setLine(ctx.ID(i).getSymbol().getLine());
            varList.add(result);
        }
        return  varList;
    }
}
