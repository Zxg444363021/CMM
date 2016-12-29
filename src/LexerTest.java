/**
 * Created by ZXG on 2016/10/20.
 */
import gen.*;
import org.antlr.v4.runtime.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class LexerTest {
    public static void main(String[] args)throws Exception{
        System.out.println("请输入测试文档路径：");
        Scanner in=new Scanner(System.in);
        String file=in.nextLine();
        System.out.println("请输入结果输出文档路径：");
        String fileout=in.nextLine();
        ANTLRInputStream input=new ANTLRFileStream(file);
        CMMLexer lexer=new CMMLexer(input);
        CommonTokenStream tokens=new CommonTokenStream(lexer);
        CMMParser parser=new CMMParser(tokens);
        parser.words();
        int a,c;
        String b,d;
        PrintWriter out=new PrintWriter(fileout);
        for(Token t:tokens.getTokens()){
            a=t.getLine();
            b=t.getText();
            c=t.getType();
            switch(c){
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
                    d=" reserved word ";
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    d=" ";
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
                    d=" ";
                    break;
                //以下是数字
                case 31:
                    d=" intNum,val=";
                    break;
                case 32:
                    d=" doubleNum,val=";
                    break;
                //以下是ID
                case 33:
                    d=" ID,name=";
                    break;
                case 34:
                    d=" 注释:";
                    break;
                case -1:
                    d=" 结束符：";
                    break;
                default:
                    d=" 不能识别的单词:";
                    break;
            }
            //输出Token行号及其T类型和值
            out.println("Line:"+a+d+b);
        }
        in.close();
        out.close();
    }

}
