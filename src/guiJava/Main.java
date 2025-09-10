package guiJava;

import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main (String[] args){
          JFrame frame=new JFrame();
          JPanel panel=new JPanel();
          JButton btn1=new JButton("1");
          btn1.setPreferredSize(new Dimension(100,60));
          JButton btn2=new JButton("2");
        btn2.setPreferredSize(new Dimension(100,60));
          JButton btn3=new JButton("3");
        btn3.setPreferredSize(new Dimension(100,60));
          JButton btn4=new JButton("4");
        btn4.setPreferredSize(new Dimension(100,60));
          JButton btn5=new JButton("5");
        btn5.setPreferredSize(new Dimension(100,60));
          JButton btn6=new JButton("6");
        btn6.setPreferredSize(new Dimension(100,60));
          JButton btn7=new JButton("7");
        btn7.setPreferredSize(new Dimension(100,60));
          JButton btn8=new JButton("8");
        btn8.setPreferredSize(new Dimension(100,60));
          JButton btn9=new JButton("9");
        btn9.setPreferredSize(new Dimension(100,60));
          JButton btn0=new JButton("0");
        btn0.setPreferredSize(new Dimension(100,60));

          JTextField operation=new JTextField();
        JButton btnPlus=new JButton("+");
        btnPlus.setPreferredSize(new Dimension(100,60));
        JButton btnMinus=new JButton("-");
        btnMinus.setPreferredSize(new Dimension(100,60));


        JButton btnMulti=new JButton("X");
        btnMulti.setPreferredSize(new Dimension(100,60));
        JButton btnDiv=new JButton("/");
        btnDiv.setPreferredSize(new Dimension(100,60));
        JButton btnDot=new JButton(".");
        btnDot.setPreferredSize(new Dimension(100,60));

panel.setPreferredSize(new Dimension(300,360));
panel.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        operation.setPreferredSize(new Dimension(300,60));

panel.add(operation);

          panel.add(btn1);
          panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btn0);
        panel.add(btnPlus);
        panel.add(btnMinus);
        panel.add(btnMulti);
        panel.add(btnDiv);
        panel.add(btnDot);
        
        panel.setBackground(Color.gray);
        frame.setLayout(new FlowLayout());
        frame.add(panel);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);




    }
}