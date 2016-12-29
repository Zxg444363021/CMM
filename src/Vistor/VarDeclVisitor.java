package Vistor;

import Utils.Macro;
import Utils.ReturnObj;
import Utils.Scope;
import gen.CMMBaseVisitor;
import gen.CMMParser;

import java.util.ArrayList;

/**
 * Created by ZXG on 2016/12/21.
 * 声明语句，包含了type的visitor
 */
public class VarDeclVisitor extends CMMBaseVisitor<ReturnObj> {
    Scope scope =new Scope();
    public void setParentScope(Scope parent){
        scope.setParent(parent);
    }

    @Override
    public ReturnObj visitVarDecl(CMMParser.VarDeclContext ctx){
        ReturnObj obj=visit(ctx.type());
        int type=obj.getType();
        int length=obj.getLength();
        //获取变量名字列表
        VarListVisitor visitor=new VarListVisitor();
        visitor.setParentScope(this.scope);
        ArrayList<ReturnObj> varList=visitor.visit(ctx.varList());
        //声明并存储数组变量
        if(type==Macro.INTARR||type==Macro.DOUBLEARR){
            if(obj.getLength()==-1)
            {}
            else{
                for(ReturnObj var:varList){
                    //将变量名和类型存在作用域中
                    //注意！varDecl语句没有单独的作用域，变量是存在它的外层作用域中的。
                    if(scope.getParent().getParent().containVar(var.getName())){
                        System.out.println("Error:line "+var.getLine()+" 变量 "+var.getName()+" 重定义！");
                    }

                    if(var.getValue()!=null){
                        System.out.println("Error:line "+var.getLine()+" 数组 "+var.getName()+" 以错误的方式赋值！");
                    }
                    scope.getParent().getParent().put(var.getName(),type,length);
                }
            }
          //声明并存储整数实数变量
        }else if(type==Macro.INTCONST||type==Macro.DOUBLECONST){
            for(ReturnObj var:varList) {
                //将变量名和类型存在作用域中
                //注意！varDecl语句没有单独的作用域，变量是存在它的外层作用域中的。
                if(scope.getParent().getParent().containVar(var.getName())){
                    System.out.println("Error:line "+var.getLine()+" 变量 "+var.getName()+" 重定义！");
                }
                if(var.getValue()!=null){
                    if(type==Macro.INTCONST)
                        scope.getParent().getParent().put(var.getName(), type, String.valueOf(Double.valueOf(var.getValue()).intValue()));
                    else
                        scope.getParent().getParent().put(var.getName(), type, String.valueOf(Double.valueOf(var.getValue()).doubleValue()));
                }else
                    scope.getParent().getParent().put(var.getName(), type);

            }
        }

        return new ReturnObj();
    }
    @Override
    public ReturnObj visitIntType(CMMParser.IntTypeContext ctx){
        ReturnObj result=new ReturnObj();
        result.setType(Macro.INTCONST);
        return result;
    }
    @Override
    public ReturnObj visitDoubleType(CMMParser.DoubleTypeContext ctx){
        ReturnObj result=new ReturnObj();
        result.setType(Macro.DOUBLECONST);
        return result;
    }
    @Override
    public ReturnObj visitIntArr(CMMParser.IntArrContext ctx){
        ReturnObj result=new ReturnObj();
        result.setType(Macro.INTARR);
        //数组声明中的 长度
        int length=Integer.parseInt(ctx.INT().getText());
        if(length<0){
            System.out.println("数组长度小于0");
        }else{
            result.setLength(length);
        }
        return result;
    }
    @Override
    public ReturnObj visitDoubleArr(CMMParser.DoubleArrContext ctx){
        ReturnObj result=new ReturnObj();
        result.setType(Macro.DOUBLEARR);
        int length=Integer.parseInt(ctx.INT().getText());
        if(length<0){
            System.out.println("数组长度小于0");
        }else{
            result.setLength(length);
        }
        return result;
    }
}
