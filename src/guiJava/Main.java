package guiJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        JPanel panel = new JPanel();

        JTextField operation = new JTextField();
        operation.setPreferredSize(new Dimension(300, 60));
        operation.setEditable(false);
        operation.setHorizontalAlignment(JTextField.RIGHT);

        // Variables to hold operands and operator
        final double[] num1 = {0};
        final String[] operator = {""};

        // Function to create buttons easily
        JButton[] numButtons = new JButton[10];
        for (int i = 0; i <= 9; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].setPreferredSize(new Dimension(100, 60));
            int finalI = i;
            numButtons[i].addActionListener(e -> {
                operation.setText(operation.getText() + finalI);
            });
        }

        JButton btnPlus = new JButton("+");
        btnPlus.setPreferredSize(new Dimension(100, 60));
        JButton btnMinus = new JButton("-");
        btnMinus.setPreferredSize(new Dimension(100, 60));
        JButton btnMulti = new JButton("×");
        btnMulti.setPreferredSize(new Dimension(100, 60));
        JButton btnDiv = new JButton("÷");
        btnDiv.setPreferredSize(new Dimension(100, 60));
        JButton btnDot = new JButton(".");
        btnDot.setPreferredSize(new Dimension(100, 60));
        JButton btnEqual = new JButton("=");
        btnEqual.setPreferredSize(new Dimension(100, 60));
        JButton btnClear = new JButton("C");
        btnClear.setPreferredSize(new Dimension(100, 60));

        // Dot button
        btnDot.addActionListener(e -> {
            if (!operation.getText().contains(".")) {
                operation.setText(operation.getText() + ".");
            }
        });

        // Clear button
        btnClear.addActionListener(e -> {
            operation.setText("");
            num1[0] = 0;
            operator[0] = "";
        });

        // Operator buttons
        btnPlus.addActionListener(e -> {
            num1[0] = Double.parseDouble(operation.getText());
            operator[0] = "+";
            operation.setText("");
        });

        btnMinus.addActionListener(e -> {
            num1[0] = Double.parseDouble(operation.getText());
            operator[0] = "-";
            operation.setText("");
        });

        btnMulti.addActionListener(e -> {
            num1[0] = Double.parseDouble(operation.getText());
            operator[0] = "×";
            operation.setText("");
        });

        btnDiv.addActionListener(e -> {
            num1[0] = Double.parseDouble(operation.getText());
            operator[0] = "÷";
            operation.setText("");
        });

        // Equal button
        btnEqual.addActionListener(e -> {
            try {
                double num2 = Double.parseDouble(operation.getText());
                double result = 0;

                switch (operator[0]) {
                    case "+":
                        result = num1[0] + num2;
                        break;
                    case "-":
                        result = num1[0] - num2;
                        break;
                    case "×":
                        result = num1[0] * num2;
                        break;
                    case "÷":
                        if (num2 != 0)
                            result = num1[0] / num2;
                        else
                            JOptionPane.showMessageDialog(frame, "Cannot divide by zero!");
                        break;
                }
                operation.setText(String.valueOf(result));
                operator[0] = "";
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid input!");
            }
        });

        // Layout setup
        panel.setPreferredSize(new Dimension(300, 420));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        panel.setBackground(Color.GRAY);

        panel.add(operation);
        for (int i = 1; i <= 9; i++) panel.add(numButtons[i]);
        panel.add(numButtons[0]);
        panel.add(btnDot);
        panel.add(btnPlus);
        panel.add(btnMinus);
        panel.add(btnMulti);
        panel.add(btnDiv);
        panel.add(btnEqual);
        panel.add(btnClear);

        frame.setLayout(new FlowLayout());
        frame.add(panel);
        frame.setSize(400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
