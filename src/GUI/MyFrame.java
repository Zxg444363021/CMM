package GUI;

import Utils.IAnalyse;
import Utils.IRead;
import Utils.MyAnalyse;
import Utils.ReturnObj;
import Vistor.ExprVisitor;
import Vistor.ProgramVisitor;
import gen.CMMLexer;
import gen.CMMParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.MenuBarUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;
import java.nio.file.Files;
import java.util.Date;
import java.util.Enumeration;
import java.util.Objects;

/**
 * Created by ZXG on 2016/12/23.
 * 界面
 */
public class MyFrame extends JFrame{
    private JTextArea textArea;
    private String path;
    private JTextArea textArea3;
    private JPanel jPanelleft;
    private JScrollPane jsp;
    private JTable jTable;
    private IAnalyse myAnalyse;
    final DefaultTableModel model = new DefaultTableModel(new String[][]{},new String[]{"行号","单词","类型"});

    public MyFrame(){
        //初始化窗体
        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension screenSize=kit.getScreenSize();
        int width=screenSize.width;
        int height=screenSize.height;
        setSize(width/2,height*2/3);
        setLocation(width/2-width/4,height/2-height/4);
        setTitle("CMM编辑器/解释器");
        setIconImage(new ImageIcon("icon.jpg").getImage());
        //关闭提醒
        addWindowListener (new WindowAdapter()
        {
            @Override
            public void windowClosing ( WindowEvent e )
            {
                int exi = JOptionPane.showConfirmDialog (null, "要退出该程序吗？", "友情提示", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (exi == JOptionPane.YES_OPTION)
                {
                    System.exit (0);
                }
                else
                {
                    return;
                }
            }
        });

        myAnalyse=new MyAnalyse();

        //对话框风格
        DialogTheme();
        changeFont();
        initMenu();
        initPanel();
    }
    //对话框风格
    public void DialogTheme(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
    //修改字体
    public void changeFont(){
        //修改字体
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        Object key = null;
        Object value = null;
        while (keys.hasMoreElements()) {
            key = keys.nextElement();
            value = UIManager.get(key);
            if(key instanceof String ) {
                /**设置全局的背景色*/
                if(((String) key).endsWith(".background")) {
                    UIManager.put(key, Color.white);
                }
            }
            /**设置全局的字体*/
            if(value instanceof Font) {
                UIManager.put(key, new Font(Font.DIALOG,Font.PLAIN,12));
            }
        }
    }
    //初始化菜单
    public void initMenu(){
        JMenuBar menuBar=new JMenuBar();
        JMenu fileMenu=new JMenu("文件");
        JMenuItem creat=new JMenuItem("新建");
        creat.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });
        JMenuItem open=new JMenuItem("打开");
        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser=new JFileChooser();
                fileChooser.setCurrentDirectory(new File("."));
                fileChooser.setFileFilter(new FileNameExtensionFilter("CMM source(*.cmm)","cmm","txt"));
                int result=fileChooser.showOpenDialog(textArea);
                File file = fileChooser.getSelectedFile();
                path=file.toString();
                setTitle("CMM编辑器/解释器    "+path);
                try {
                    byte[] bytes= Files.readAllBytes(file.toPath());
                    String text=new String(bytes);
                    textArea.setText(text);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

            }
        });
        JMenuItem save=new JMenuItem("保存");
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(path==null){
                    JFileChooser fileChooser=new JFileChooser();
                    fileChooser.setCurrentDirectory(new File("."));
                    fileChooser.setFileFilter(new FileNameExtensionFilter("CMM source(*.cmm)","cmm","txt"));
                    int result=fileChooser.showSaveDialog(null);
                    File file=fileChooser.getSelectedFile();
                    String path=file.toString();
                    try {
                        if(!(file.toString().endsWith(".cmm")||file.toString().endsWith(".txt")))
                            path=file.toString()+".cmm";
                        FileWriter fileWriter=new FileWriter(path);
                        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                        String content=textArea.getText();
                        String[] lines=content.split("\n");
                        for(String str:lines){
                            bufferedWriter.write(str);
                            bufferedWriter.newLine();
                            bufferedWriter.flush();
                        }
                        fileWriter.close();
                        bufferedWriter.close();
                        JOptionPane.showMessageDialog(null,"保存成功！");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                        JOptionPane.showMessageDialog(null,"保存失败！");
                    }

                }else{
                    try {
                        FileWriter fileWriter=new FileWriter(path);
                        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                        String content=textArea.getText();
                        String[] lines=content.split("\n");
                        for(String str:lines){
                            bufferedWriter.write(str);
                            bufferedWriter.newLine();
                            bufferedWriter.flush();
                        }
                        fileWriter.close();
                        bufferedWriter.close();
                        JOptionPane.showMessageDialog(null,"保存成功！");

                    } catch (IOException e1) {
                        e1.printStackTrace();
                        JOptionPane.showMessageDialog(null,"保存失败！");
                    }
                }
            }
        });
        JMenuItem saveas=new JMenuItem("另存为");
        saveas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser=new JFileChooser();
                fileChooser.setCurrentDirectory(new File("."));
                fileChooser.setFileFilter(new FileNameExtensionFilter("CMM source(*.cmm)","cmm","txt"));
                int result=fileChooser.showSaveDialog(null);
                File file=fileChooser.getSelectedFile();
                String path=file.toString();
                try {
                    if(!(file.toString().endsWith(".cmm")||file.toString().endsWith(".txt")))
                        path=file.toString()+".cmm";
                    FileWriter fileWriter=new FileWriter(path);
                    BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                    String content=textArea.getText();
                    String[] lines=content.split("\n");
                    for(String str:lines){
                        bufferedWriter.write(str);
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    }
                    fileWriter.close();
                    bufferedWriter.close();
                    JOptionPane.showMessageDialog(null,"保存成功！");
                } catch (IOException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null,"保存失败！");
                }
            }
        });
        JMenuItem exit=new JMenuItem("退出");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //关闭提醒
                int exi = JOptionPane.showConfirmDialog (null, "要退出该程序吗？", "友情提示", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (exi == JOptionPane.YES_OPTION)
                {
                    System.exit (0);
                }
                else
                {
                    return;
                }
            }
        });
        fileMenu.add(creat);
        fileMenu.add(open);
        fileMenu.add(save);
        fileMenu.add(saveas);
        fileMenu.add(exit);
        menuBar.add(fileMenu);
        JMenu build=new JMenu("构建");
        JMenuItem lexer=new JMenuItem("词法分析");
        lexer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea3.setText("");
                myAnalyse.Lexer(textArea.getText(),jTable);
            }
        });
        JMenuItem parser=new JMenuItem("语法分析");
        parser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea3.setText("");
                myAnalyse.parser(textArea.getText());
            }
        });
        JMenuItem run=new JMenuItem("运行");
        run.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea3.setText("");
                myAnalyse.visitor(textArea.getText());
            }
        });
        JMenuItem all=new JMenuItem("全部执行");
        all.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea3.setText("");
                myAnalyse.runAll(textArea.getText(),jTable);
            }
        });
        build.add(lexer);
        build.add(parser);
        build.add(run);
        build.add(all);
        menuBar.add(build);
        setJMenuBar(menuBar);

    }
    //初始化panel
    public void initPanel(){
        PrintStream myOut = new PrintStream(textAreaStream);
        System.setOut(myOut);
        System.setErr(myOut);

        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        jPanelleft=new JPanel();
        jPanelleft.setLayout(layout);
        jPanelleft.setBorder(BorderFactory.createEtchedBorder());
        JTextArea textArea1=new JTextArea(10,4);
        textArea1.setEditable(false);
        jTable=new JTable(model);
        jTable.getColumnModel().getColumn(0).setMaxWidth(60);
        jTable.getColumnModel().getColumn(1).setMaxWidth(70);
        jTable.getColumnModel().getColumn(2).setMaxWidth(70);

        jPanelleft.setBorder(BorderFactory.createTitledBorder("词法分析"));
        gbc.fill=GridBagConstraints.BOTH;
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.weighty=1;
        gbc.weightx=1;
        jsp=new JScrollPane(jTable);
        jPanelleft.add(jsp ,gbc);


        JPanel jPanelright=new JPanel();
        jPanelright.setLayout(layout);
        jPanelright.setBorder(BorderFactory.createEtchedBorder());
        JTextArea textArea2=new JTextArea(10,4);
        textArea2.setEditable(false);
        jPanelright.setBorder(BorderFactory.createTitledBorder("语法分析"));
        jPanelright.add(new JScrollPane(textArea2),gbc);

        JPanel jPanelbottom=new JPanel();
        jPanelbottom.setLayout(layout);
        textArea3=new JTextArea(5,20);
        textArea3.setEditable(false);
        jPanelbottom.setBorder(BorderFactory.createTitledBorder("控制台输出"));
        jPanelbottom.add(new JScrollPane(textArea3),gbc);

        JPanel editPanel=new JPanel();
        editPanel.setLayout(layout);
        textArea=new JTextArea(20,60);
        Font font=new Font("宋体",Font.PLAIN,18);
        textArea.setFont(font);
        JScrollPane jScrollPane=new JScrollPane(textArea);
        jScrollPane.setRowHeaderView(new LineNumberHeaderView());
        editPanel.setBorder(BorderFactory.createTitledBorder("编辑区"));
        editPanel.add(jScrollPane,gbc);

        GridBagLayout layout1 = new GridBagLayout();
        GridBagConstraints gbc1 = new GridBagConstraints();
        setLayout(layout1);

        gbc1.fill=GridBagConstraints.BOTH;
        gbc1.gridx=0;
        gbc1.gridy=0;
        gbc1.weightx=0.2;
        gbc1.weighty=0.7;
        gbc1.gridwidth=1;
        gbc1.gridheight=3;
        add(jPanelleft,gbc1);
        gbc1.gridx=1;
        gbc1.gridy=0;
        gbc1.weightx=0.8;
        gbc1.gridwidth=3;
        add(editPanel,gbc1);
        gbc1.gridx=3;
        gbc1.gridy=0;
//        gbc1.weightx=0.25;
        gbc1.gridwidth=1;
        //add(jPanelright,gbc1);

        gbc1.gridx = 0;
        gbc1.gridy = 3;
        gbc1.weightx=1;
        gbc1.weighty=0.3;
        gbc1.gridwidth=4;
        gbc1.gridheight=1;
        add(jPanelbottom,gbc1);
    }

    //获取输出流到GUI控制台区域显示。
    OutputStream textAreaStream = new OutputStream() {
        public void write(int b) throws IOException {
            textArea3.append(String.valueOf((char)b));
        }

        public void write(byte b[]) throws IOException {
            textArea3.append(new String(b));
        }

        public void write(byte b[], int off, int len) throws IOException {
            textArea3.append(new String(b, off, len));
        }
    };
}
