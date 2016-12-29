package Utils;

import javax.swing.*;

/**
 * Created by ZXG on 2016/12/24.
 *
 */
public interface IAnalyse {
    public void visitor(String content);
    public void parser(String content);
    public void Lexer(String content, JTable table);
    public void runAll(String content,JTable table);
}
