package Vistor;

import Utils.Macro;
import Utils.ReturnObj;
import gen.CMMBaseVisitor;
import gen.CMMParser;

/**
 * Created by ZXG on 2016/12/22.
 * break语句
 */
public class BreakVisitor extends CMMBaseVisitor<ReturnObj>{
    @Override
    public ReturnObj visitBreakStmt(CMMParser.BreakStmtContext ctx){
        ReturnObj result=new ReturnObj();
        result.setType(Macro.IFBREAK);
        return result;
    }
}
