package Vistor;

import Utils.Macro;
import Utils.ReturnObj;
import Utils.Scope;
import gen.CMMBaseVisitor;
import gen.CMMLexer;
import gen.CMMParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;

/**
 * Created by ZXG on 2016/12/22.
 */
public class ReadVisitor extends CMMBaseVisitor<ReturnObj> {
    Scope scope;
    public void setParentScope(Scope parent){
        scope =new Scope(parent);}
    @Override
    public ReturnObj visitReadStmt(CMMParser.ReadStmtContext ctx){
        ValVisitor visitor=new ValVisitor();
        visitor.setParentScope(this.scope);
        ReturnObj var=visitor.visit(ctx.value());
        String value=JOptionPane.showInputDialog("请输入"+var.getName()+" 的值");
        ANTLRInputStream antlrStringStream=new ANTLRInputStream(value);
        CMMLexer lexer = new CMMLexer(antlrStringStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CMMParser parser = new CMMParser(tokens);
        ParseTree tree = parser.expr();
        ExprVisitor visitor1=new ExprVisitor();
        visitor1.setParentScope(this.scope);
        ReturnObj returnObj=visitor1.visit(tree);

        if(var.getType()== Macro.INTCONST){
            scope.setValue(var.getName(),String.valueOf(Double.valueOf(returnObj.getValue()).intValue()));
        }else if(var.getType()==Macro.DOUBLECONST){
            scope.setValue(var.getName(),String.valueOf(Double.valueOf(returnObj.getValue()).doubleValue()));
        }else if(var.getType()==Macro.INTARR){
            scope.setValue(var.getName(),var.getIndex(),String.valueOf(Double.valueOf(returnObj.getValue()).intValue()));
        }else if(var.getType()==Macro.DOUBLEARR){
            scope.setValue(var.getName(),var.getIndex(),String.valueOf(Double.valueOf(returnObj.getValue()).doubleValue()));
        }



        return new ReturnObj();
    }
}
