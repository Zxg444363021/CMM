import gen.CMMBaseListener;
import gen.CMMLexer;
import gen.CMMListener;
import gen.CMMParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.gui.Trees;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

/**
 * Created by ZXG on 2016/11/9.
 */
public class ParserTest {
    public static void main(String[] args ) throws IOException {

        try {
            System.out.println("请输入测试文档路径：");
            Scanner in = new Scanner(System.in);
            String file = in.nextLine();
            System.out.println("请输入结果输出文档路径：");
            String fileout = in.nextLine();
            ANTLRFileStream input = new ANTLRFileStream(file);

            CMMLexer lexer = new CMMLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CMMParser parser = new CMMParser(tokens);
            ParseTree tree = parser.program();
            PrintWriter out = new PrintWriter(fileout);
            out.println("由语法分析得出的测试脚本的程序结构如下：");
            out.println(tree.toStringTree(parser));
            Trees.inspect(tree,parser);
            in.close();
            out.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
