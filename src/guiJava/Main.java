package guiJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // import for ActionListener

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        // Input field
        JTextField operation = new JTextField();
        operation.setPreferredSize(new Dimension(300, 60));
        operation.setEditable(false); // user can’t type manually
        operation.setHorizontalAlignment(JTextField.RIGHT); // align text to the right

        // Function to create buttons easily
        JButton[] numButtons = new JButton[10];
        for (int i = 0; i <= 9; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].setPreferredSize(new Dimension(100, 60));
            int finalI = i; // needed for use inside lambda
            numButtons[i].addActionListener(e -> {
                operation.setText(operation.getText() + finalI);
            });
        }

        JButton btnPlus = new JButton("+");
        btnPlus.setPreferredSize(new Dimension(100, 60));
        JButton btnMinus = new JButton("-");
        btnMinus.setPreferredSize(new Dimension(100, 60));
        JButton btnMulti = new JButton("X");
        btnMulti.setPreferredSize(new Dimension(100, 60));
        JButton btnDiv = new JButton("/");
        btnDiv.setPreferredSize(new Dimension(100, 60));
        JButton btnDot = new JButton(".");
        btnDot.setPreferredSize(new Dimension(100, 60));

        // add functionality to dot button
        btnDot.addActionListener(e -> {
            operation.setText(operation.getText() + ".");
        });

        panel.setPreferredSize(new Dimension(300, 360));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.setBackground(Color.GRAY);

        // Add components
        panel.add(operation);
        for (int i = 1; i <= 9; i++) {
            panel.add(numButtons[i]);
        }
        panel.add(numButtons[0]);
        panel.add(btnPlus);
        panel.add(btnMinus);
        panel.add(btnMulti);
        panel.add(btnDiv);
        panel.add(btnDot);

        frame.setLayout(new FlowLayout());
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
