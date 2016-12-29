package Vistor;

import Utils.Macro;
import Utils.ReturnObj;
import Utils.Scope;
import gen.CMMBaseVisitor;
import gen.CMMParser;

/**
 * Created by ZXG on 2016/12/22.
 */
public class StmtBlockVisitor extends CMMBaseVisitor<ReturnObj> {
    Scope scope =new Scope();
    public void setParentScope(Scope parent){
        scope.setParent(parent);
    }
    @Override
    public ReturnObj visitStmtBlock(CMMParser.StmtBlockContext ctx){
        for(int i=0;i<ctx.stmt().size();i++){
            StmtVisitor vistor=new StmtVisitor();
            vistor.setParentScope(this.scope);
            ReturnObj result=vistor.visit(ctx.stmt(i));
            if(result.getType()== Macro.IFBREAK){
                //如果遇到break;那么当前块中的剩余语句也不再执行下去;并返回带有break标识的ReturnObj
                i=ctx.stmt().size();
                return result;
            }
        }

       return new ReturnObj();
    }
}
