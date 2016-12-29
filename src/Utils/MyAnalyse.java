package Utils;

import Vistor.ProgramVisitor;
import gen.CMMLexer;
import gen.CMMParser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

/**
 * Created by ZXG on 2016/12/26.
 */
public class MyAnalyse implements IAnalyse {

    public MyAnalyse(){

    }
    @Override
    public void visitor(String content) {
        System.out.println("-----运行 "+new Date().toString()+" -----");
        ANTLRInputStream antlrStringStream=new ANTLRInputStream(content);
        CMMLexer lexer = new CMMLexer(antlrStringStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CMMParser parser = new CMMParser(tokens);
        ParseTree tree = parser.program();
        int a=parser.getNumberOfSyntaxErrors();
        if(a==0){
            ProgramVisitor visitor=new ProgramVisitor();
            visitor.visit(tree);
        }else{

        }
    }

    @Override
    public void parser(String content) {
        System.out.println("-----语法分析 "+new Date().toString()+" -----");
        ANTLRInputStream antlrStringStream=new ANTLRInputStream(content);
        CMMLexer lexer = new CMMLexer(antlrStringStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CMMParser parser = new CMMParser(tokens);
        ParseTree tree = parser.program();
        Trees.inspect(tree,parser);
    }

    @Override
    public void Lexer(String content, JTable table) {
        ((DefaultTableModel) table.getModel()).getDataVector().removeAllElements();
        System.out.println("-----词法分析 " + new Date().toString() + " -----");
        ANTLRInputStream antlrStringStream = new ANTLRInputStream(content);
        CMMLexer lexer = new CMMLexer(antlrStringStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CMMParser parser = new CMMParser(tokens);
        parser.words();
        int a, c;
        String b, type = "";
        for (Token t : tokens.getTokens()) {
            a = t.getLine();
            b = t.getText();
            c = t.getType();
            switch (c) {
                case 36:
                    type = "comment";
                    break;
                //以下是保留字
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    type = "reserved word";
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    type = "sign";
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                    type = "operator";
                    break;
                //以下是数字
                case 32:
                    type = "intNum";
                    break;
                case 33:
                    type = "doubleNum";
                    break;
                //以下是ID
                case 34:
                    type = "ID";
                    break;
                case 35:
                    type = "annotation:";
                    break;
                case -1:
                    type = "end sign";
                    break;
            }
            ((DefaultTableModel) (table.getModel())).addRow(new String[] { "" + a,b, type });
        }
    }
    @Override
    public void runAll(String content, JTable table) {
        Lexer(content,table);
        parser(content);
        visitor(content);
    }
}
