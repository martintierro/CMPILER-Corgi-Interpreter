import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class GUI {
    private JFrame frame;
    JTextPane textPane;
    JTextPane textPane2;

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 1100, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Run");
        btnNewButton.setBounds(724, 402, 150, 45);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                run();
            }
        });
        frame.getContentPane().add(btnNewButton);

        JButton btnParse = new JButton("Parse");
        btnParse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ANTLRInputStream input = new ANTLRInputStream(getInput());
                lexer = new gLexer(input);
                TokenStream tokenStream = new CommonTokenStream(lexer);
                parser = new gParser(tokenStream);

                ErrorListener listener = new ErrorListener();
                parser.addErrorListener(listener);
                ParseTree tree = parser.compilationUnit();
                TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
                viewer.setScale(1.5); //scale a little
                viewer.open();
            }
        });
        btnParse.setBounds(564, 402, 150, 45);
        frame.getContentPane().add(btnParse);

        JButton btn_scan = new JButton("Scan");
        btn_scan.setBounds(404, 402, 150, 45);
        frame.getContentPane().add(btn_scan);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(10, 339, 388, 111);
        frame.getContentPane().add(panel);

        JList list = new JList();
        list.setBounds(884, 11, 190, 436);
        frame.getContentPane().add(list);

        textPane = new JTextPane();
        textPane.setBounds(10, 11, 388, 321);
        frame.getContentPane().add(textPane);

        textPane2 = new JTextPane();
        textPane2.setBounds(408, 11, 466, 380);
        frame.getContentPane().add(textPane2);
        frame.setVisible(true);
    }
}
