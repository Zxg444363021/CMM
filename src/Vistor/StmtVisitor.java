package Vistor;

import Utils.Macro;
import Utils.ReturnObj;
import Utils.Scope;
import gen.CMMBaseVisitor;
import gen.CMMParser;

/**
 * Created by ZXG on 2016/12/22.
 */
public class StmtVisitor extends CMMBaseVisitor<ReturnObj> {
    Scope scope =new Scope();
    public void setParentScope(Scope parent){
        scope.setParent(parent);
    }
    @Override
    public ReturnObj visitSvar(CMMParser.SvarContext ctx){
        VarDeclVisitor visitor=new VarDeclVisitor();
        visitor.setParentScope(this.scope);
        ReturnObj result=visitor.visit(ctx.varDecl());
        return result;
    }
    @Override
    public ReturnObj visitSassign(CMMParser.SassignContext ctx){
        AssignVisitor vistor=new AssignVisitor();
        vistor.setParentScope(this.scope);
        ReturnObj result=vistor.visit(ctx.assignStmt());
        return result;
    }
    @Override
    public ReturnObj visitSif(CMMParser.SifContext ctx){
        IfVisitor vistor=new IfVisitor();
        vistor.setParentScope(this.scope);
        ReturnObj result=vistor.visit(ctx.ifStmt());
        return result;
    }
    @Override
    public ReturnObj visitSwrite(CMMParser.SwriteContext ctx){
        WriteVisitor visitor=new WriteVisitor();
        visitor.setParentScope(this.scope);
        ReturnObj result=visitor.visit(ctx.writeStmt());
        return result;
    }
    @Override
    public ReturnObj visitSblock(CMMParser.SblockContext ctx){
        StmtBlockVisitor visitor=new StmtBlockVisitor();
        visitor.setParentScope(this.scope);
        ReturnObj result=visitor.visit(ctx.stmtBlock());
        return result;
    }
    //break语句
    @Override
    public ReturnObj visitSbreak(CMMParser.SbreakContext ctx){
        BreakVisitor visitor=new BreakVisitor();
        ReturnObj result=visitor.visit(ctx.breakStmt());
        if(result.getType()== Macro.IFBREAK){
            return result;
        }else
            return new ReturnObj();
    }

    @Override
    public ReturnObj visitSwhile(CMMParser.SwhileContext ctx){
        WhileVisitor visitor=new WhileVisitor();
        visitor.setParentScope(this.scope);
        ReturnObj result=visitor.visit(ctx.whileStmt());
        return result;
    }

    @Override
    public ReturnObj visitSread(CMMParser.SreadContext ctx){
        ReadVisitor visitor=new ReadVisitor();
        visitor.setParentScope(this.scope);
        return visitor.visit(ctx.readStmt());
    }
}
