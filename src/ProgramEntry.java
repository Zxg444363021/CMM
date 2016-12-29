import GUI.MyFrame;
import Vistor.ProgramVisitor;
import gen.CMMLexer;
import gen.CMMParser;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by ZXG on 2016/12/20.
 */
public class ProgramEntry {
    public static void main(String[] args)throws IOException {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyFrame frame=new MyFrame();
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
