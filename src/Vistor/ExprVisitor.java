package Vistor;

import Utils.Macro;
import Utils.ReturnObj;
import Utils.Scope;
import gen.CMMBaseVisitor;
import gen.CMMParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * Created by ZXG on 2016/12/20.
 * 表达式语句
 */
public class ExprVisitor extends CMMBaseVisitor<ReturnObj> {
    //节点存储数据结构
    ParseTreeProperty<Scope> values = new ParseTreeProperty<Scope>();
    public void setValue(ParseTree node, Scope value) { values.put(node, value); }
    public Scope getValue(ParseTree node) { return values.get(node); }
    Scope scope;
    public ExprVisitor setParentScope(Scope parent){
        scope =new Scope(parent);
        return this;
    }
    //整数，返回内容：type=1 value;
    @Override
    public ReturnObj visitIntCon(CMMParser.IntConContext ctx){
        int line=ctx.INT().getSymbol().getLine();
        return new ReturnObj(Macro.INTCONST,ctx.INT().getText());
    }
    //实数，返回内容 type=2;value
    @Override
    public ReturnObj visitDoubleCon(CMMParser.DoubleConContext ctx){
        ReturnObj returnObj=new ReturnObj();
        returnObj.setType(Macro.DOUBLECONST);
        returnObj.setValue(ctx.DOUBLE().getText());
        returnObj.setName(ctx.DOUBLE().getText());
        return returnObj;
    }
    //true
    @Override
    public ReturnObj visitTrue(CMMParser.TrueContext ctx){
        return new ReturnObj(Macro.BOOLEAN,"1");
    }
    //false
    @Override
    public ReturnObj visitFalse(CMMParser.FalseContext ctx){
        return new ReturnObj(Macro.BOOLEAN,"0");
    }
    //比较大小
    @Override
    public ReturnObj visitComp(CMMParser.CompContext ctx){
        ReturnObj result=new ReturnObj();
        double left=Double.parseDouble(visit(ctx.expr(0)).getValue());
        double right=Double.parseDouble(visit(ctx.expr(1)).getValue());
        switch(ctx.op.getType()){
            case CMMParser.LOE:
                if(left<=right)
                    result.setValue("1");
                else
                    result.setValue("0");
                break;
            case CMMParser.GOE:
                if(left>=right)
                    result.setValue("1");
                else
                    result.setValue("0");
                break;
            case CMMParser.GREATER:
                if(left>right)
                    result.setValue("1");
                else
                    result.setValue("0");
                break;
            case CMMParser.LESS:
                if(left<right)
                    result.setValue("1");
                else
                    result.setValue("0");
                break;
            case CMMParser.EQU:
                if(left==right)
                    result.setValue("1");
                else
                    result.setValue("0");
                break;
            case CMMParser.NEQU:
                if(left!=right)
                    result.setValue("1");
                else
                    result.setValue("0");
                break;
        }
        return result;
    }

    //逻辑与或
    @Override
    public ReturnObj visitLogicComp(CMMParser.LogicCompContext ctx){
        ReturnObj returnObj=new ReturnObj();
        double left=Double.valueOf(visit(ctx.expr(0)).getValue());
        double right=Double.valueOf(visit(ctx.expr(1)).getValue());
        switch(ctx.op.getType()){
            case CMMParser.LogAnd:
            case CMMParser.LogAnds:
                if(left!=0&&right!=0)
                    returnObj.setValue("1");
                else
                    returnObj.setValue("0");
                break;
            case CMMParser.LogOr:
            case CMMParser.LogOrs:
                if(left!=0||right!=0)
                    returnObj.setValue("1");
                else
                    returnObj.setValue("0");
                break;
        }
        return returnObj;
    }
    //逻辑非
    @Override
    public ReturnObj visitLogicNot(CMMParser.LogicNotContext ctx){
        ReturnObj returnObj=new ReturnObj();
        double exp=Double.valueOf(visit(ctx.expr()).getValue());
        if(exp==0)
            returnObj.setValue("1");
        else
            returnObj.setValue("0");
        return returnObj;
    }
    //乘法除法求余计算
    /*
    *int op int  ->int
    *double op double   ->double
    *boolean op boolean  ->int
    *(double op *)||(* op double)  ->double
    *(int op boolean)||(boolean op int) ->int
     */
    @Override
    public ReturnObj visitMulDivMod(CMMParser.MulDivModContext ctx){
        ReturnObj left=visit(ctx.expr(0));
        ReturnObj right=visit(ctx.expr(1));
        ReturnObj result=new ReturnObj();
        int type1=left.getType();
        int type2=right.getType();
        if((type1==Macro.INTCONST&&type2==Macro.INTCONST)
            ||(type1==Macro.BOOLEAN&&type2==Macro.BOOLEAN)
            ||(type1==Macro.INTCONST&&type2==Macro.BOOLEAN)
                ||(type1==Macro.BOOLEAN&&type2==Macro.INTCONST)){   //两个操作数都是int或都是boolean或一int一boolean 结果转为int
            result.setType(Macro.INTCONST);
            switch(ctx.op.getType()){
                case CMMParser.MUL:
                    result.setValue(String.valueOf(Integer.valueOf(left.getValue())*Integer.valueOf(right.getValue())));
                    break;
                case CMMParser.DIV:
                    if(Integer.valueOf(right.getValue())!=0){
                        result.setValue(String.valueOf(Integer.valueOf(left.getValue())/Integer.valueOf(right.getValue())));
                    }
                    else{
                        System.out.println("Error:line"+ctx.op.getLine()+" 除数为0");
                    }
                    break;
            }
        }else if(type1==Macro.DOUBLECONST&&type2==Macro.DOUBLECONST){
            result.setType(Macro.DOUBLECONST);
            switch(ctx.op.getType()) {
                case CMMParser.MUL:
                    result.setValue(String.valueOf(Double.valueOf(left.getValue()) * Double.valueOf(right.getValue())));
                    break;
                case CMMParser.DIV:
                    if (Double.valueOf(right.getValue()) != 0) {
                        result.setValue(String.valueOf(Double.valueOf(left.getValue()) / Double.valueOf(right.getValue())));
                    } else {
                        System.out.println("Error:line"+ctx.op.getLine()+" 除数为0");
                    }
                    break;
            }
        }else if((type1==Macro.DOUBLECONST&&!(type2==Macro.DOUBLECONST))  //如果两个操作数中只有一个是double那么结果转为double
                ||(!(type1==Macro.DOUBLECONST)&&type2==Macro.DOUBLECONST)){
            result.setType(Macro.DOUBLECONST);
            switch(ctx.op.getType()) {
                case CMMParser.MUL:
                    result.setValue(String.valueOf(Double.valueOf(left.getValue()) * Double.valueOf(right.getValue())));
                    break;
                case CMMParser.DIV:
                    if (Double.valueOf(right.getValue()) != 0) {
                        result.setValue(String.valueOf(Double.valueOf(left.getValue()) / Double.valueOf(right.getValue())));
                    } else {
                        System.out.println("Error:line"+ctx.op.getLine()+" 除数为0");
                    }
                    break;
            }
        }else{}
        return result;
    }
    //加减法计算
    /*
    *int op int  ->int
    *double op double   ->double
    *boolean op boolean  ->int
    *(double op *)||(* op double)  ->double
    *(int op boolean)||(boolean op int) ->int
    * 有问题！！！
     */
    @Override
    public ReturnObj visitAddSub(CMMParser.AddSubContext ctx){
        ReturnObj left=visit(ctx.expr(0));
        ReturnObj right=visit(ctx.expr(1));
        ReturnObj result=new ReturnObj();
        int type1=left.getType();
        int type2=right.getType();
        if((type1==Macro.INTCONST&&type2==Macro.INTCONST)
                ||(type1==Macro.INTCONST&&type2==Macro.BOOLEAN)
                ||(type1==Macro.BOOLEAN&&type2==Macro.INTCONST)){   //两个操作数都是int或都是boolean或一int一boolean 结果转为int
            result.setType(Macro.INTCONST);
            switch(ctx.op.getType()){
                case CMMParser.ADD:
                    result.setValue(String.valueOf(Integer.valueOf(left.getValue())+Integer.valueOf(right.getValue())));
                    break;
                case CMMParser.SUB:
                    result.setValue(String.valueOf(Integer.valueOf(left.getValue())-Integer.valueOf(right.getValue())));
                    break;
            }
        }else if(type1==Macro.DOUBLECONST&&type2==Macro.DOUBLECONST){
            result.setType(Macro.DOUBLECONST);
            switch(ctx.op.getType()) {
                case CMMParser.ADD:
                    result.setValue(String.valueOf(Double.valueOf(left.getValue()) + Double.valueOf(right.getValue())));
                    break;
                case CMMParser.SUB:
                    result.setValue(String.valueOf(Double.valueOf(left.getValue()) - Double.valueOf(right.getValue())));
                    break;
            }
        }else if((type1==Macro.DOUBLECONST&&!(type2==Macro.DOUBLECONST))  //如果两个操作数中只有一个是double那么结果转为double
                ||(!(type1==Macro.DOUBLECONST)&&type2==Macro.DOUBLECONST)){
            result.setType(Macro.DOUBLECONST);
            switch(ctx.op.getType()) {
                case CMMParser.ADD:
                    result.setValue(String.valueOf(Double.valueOf(left.getValue()) + Double.valueOf(right.getValue())));
                    break;
                case CMMParser.SUB:
                    result.setValue(String.valueOf(Double.valueOf(left.getValue()) - Double.valueOf(right.getValue())));
                    break;
            }
        }else {
            System.out.println("未识别");
        }
        return result;
    }
    //负数
    @Override
    public ReturnObj visitNeg(CMMParser.NegContext ctx){
        ReturnObj result=visit(ctx.expr());
        String value=result.getValue();
        result.setValue("-"+value);
        return result;
    }
    //带括号
    @Override
    public ReturnObj visitParens(CMMParser.ParensContext ctx){
        return visit(ctx.expr());
    }
    //变量名
    @Override
    public ReturnObj visitVal(CMMParser.ValContext ctx){
        ValVisitor visitor=new ValVisitor();
        visitor.setParentScope(this.scope);
        ReturnObj returnObj=visitor.visit(ctx.value());
        if(returnObj.getType()==Macro.NotIndex) {
            System.out.println("Error:line" + returnObj.getLine() + "  数组下标不是int类型");
        }
        else if(returnObj.getType()==Macro.OutOfBounds){
            System.out.println("Error:line"+returnObj.getLine()+"  数组访问越界");
        }
        else if(returnObj.getType()==Macro.NOTDECLARED){
            System.out.println("Error:line"+returnObj.getLine()+"  无法读取值，变量"+returnObj.getName()+"没有被声明过");
        }else if(returnObj.getValue()==null){
            System.out.println("Error:line"+returnObj.getLine()+"  无法读取值，变量"+returnObj.getName()+"没有被赋值");
        }
        return returnObj;
    }

}
