package Vistor;

import Utils.Macro;
import Utils.ReturnObj;
import Utils.Scope;
import gen.CMMBaseVisitor;
import gen.CMMParser;

/**
 * Created by ZXG on 2016/12/21.
 */
public class ValVisitor extends CMMBaseVisitor<ReturnObj> {
    Scope scope;

    public void setParentScope(Scope parentMap){
        scope =new Scope(parentMap);
    }
    /*
    *数组元素
     */
    @Override
    public ReturnObj visitAryId(CMMParser.AryIdContext ctx){
        //数组名
        String name=ctx.ID().getText();
        int line=ctx.ID().getSymbol().getLine();
        ExprVisitor visitor=new ExprVisitor();
        visitor.setParentScope(this.scope);
        //数组下标，由表达式计算得来
        ReturnObj index=visitor.visit(ctx.expr());
        //visit Expr返回的类型只要不是double都可以当作数组下标
        ReturnObj result=new ReturnObj();

        if(!(index.getType()== Macro.DOUBLECONST)&&!(index.getType()==Macro.DOUBLEARR)){
            int i=Integer.parseInt(index.getValue());
            if(scope.contain(name)){
                    if(i<0||i> scope.getItemLength(name)-1){
                        result.setType(Macro.OutOfBounds);
                        result.setLine(line);
                        return result;
                    }
                    result.setType(scope.getType(name));//类型
                    result.setName(name);//数组变量名
                    result.setIndex(Integer.parseInt(index.getValue()));//下标
                    result.setValue( scope.getElementValue(name,i));//值
                    return result;
            }else{
                result.setType(Macro.NOTDECLARED);
                result.setName(name);
                result.setLine(line);
                return result;
            }
        }else {
            result.setType(Macro.NotIndex);
            result.setLine(line);
            result.setName(index.getName());
            return result;
        }
    }

    @Override
    public ReturnObj visitId(CMMParser.IdContext ctx){
        ReturnObj result=new ReturnObj();
        String name=ctx.ID().getText();
        int line=ctx.ID().getSymbol().getLine();
        String value=null;
        int type=-1;
        if(scope.contain(name)){
            type= scope.getType(name);
            if(scope.getValue(name)!=null) {
                value = scope.getValue(name);
                result.setType(type);
                result.setName(name);
                result.setLine(line);
                result.setValue(value);
                return result;
            }else{
                result.setType(type);
                result.setName(name);
                result.setLine(line);
                return result;
            }
        }else{
            //System.out.println("Line:"+line+"  变量"+name+"没有被声明过");
            result.setType(Macro.NOTDECLARED);
            result.setLine(line);
            result.setName(name);
            return result;
        }

    }
}
