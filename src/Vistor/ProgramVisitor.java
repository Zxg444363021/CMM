package Vistor;

import Utils.ReturnObj;
import Utils.Scope;
import gen.CMMBaseVisitor;
import gen.CMMParser;

/**
 * Created by ZXG on 2016/12/22.
 */
public class ProgramVisitor extends CMMBaseVisitor<ReturnObj> {
    //作为程序作用域根节点的全局作用域
    Scope scope =new Scope();
    @Override
    public ReturnObj visitProgram(CMMParser.ProgramContext ctx){
        StmtVisitor visitor=new StmtVisitor();
        visitor.setParentScope(this.scope);
        visitor.visit(ctx.stmt(0));
        for(int i=1;i<ctx.stmt().size();i++){
            //应该为每一个语句新建一个作用域，否则它们会共享作用域。
            StmtVisitor visitor1=new StmtVisitor();
            visitor1.setParentScope(this.scope);
            visitor1.visit(ctx.stmt(i));
        }
        return new ReturnObj();
    }
}
