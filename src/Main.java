import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

import static java.lang.Integer.valueOf;

public class Main extends JFrame {
    // create a frame
    static JFrame f;

    // create a textfield
    static JTextField l;
    // store operator and operands
    String s0, s1, s2;

    // default constructor
    Main()
    {
        s0 = s1 = s2 = "";
    }

    public static void aggiornaTesto(String txt){
        l.setText(l.getText() + txt);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // create a frame
        f = new JFrame("calculator");

        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }


        // create a textfield
        l = new JTextField(16);

        // set the textfield to not editable
        l.setEditable(false);

        // create number buttons and some operators
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;

        // create number buttons
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        // equals button
        beq1 = new JButton("=");

        // create operator buttons
        ba = new JButton("+");
        bs = new JButton("-");
        bd = new JButton("/");
        bm = new JButton("*");
        beq = new JButton("C");

        // create . button
        be = new JButton(".");

        // create a panel
        JPanel p = new JPanel();

        // add action listeners
        bm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        bs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        ba.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculator.setOperatore(ba.getText());
                aggiornaTesto(ba.getText());
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculator.setN( valueOf(b9.getText()));
                aggiornaTesto(b9.getText());
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculator.setN( valueOf(b8.getText()));
                aggiornaTesto(b8.getText());
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculator.setN( valueOf(b7.getText()));
                aggiornaTesto(b7.getText());
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculator.setN( valueOf(b6.getText()));
                aggiornaTesto(b6.getText());
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculator.setN( valueOf(b5.getText()));
                aggiornaTesto(b5.getText());
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculator.setN( valueOf(b4.getText()));
                aggiornaTesto(b4.getText());
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculator.setN( valueOf(b3.getText()));
                aggiornaTesto(b3.getText());
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculator.setN( valueOf(b2.getText()));
                aggiornaTesto(b2.getText());
            }
        });
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculator.setN( valueOf(b1.getText()));
                aggiornaTesto(b1.getText());
            }
        });
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculator.setN( valueOf(b0.getText()));
                aggiornaTesto(b0.getText());
            }
        });
        be.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        beq.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        beq1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("");
                aggiornaTesto(calculator.uguale()).toString();
            }
        });

        // add elements to panel
        p.add(l);
        p.add(ba);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bs);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bm);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bd);
        p.add(be);
        p.add(b0);
        p.add(beq);
        p.add(beq1);

        // set Background of panel
        p.setBackground(Color.CYAN);

        // add panel to frame
        f.add(p);

        f.setSize(200, 220);
        f.show();
    }


}