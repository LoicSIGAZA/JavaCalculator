package com.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    private JTextField num1Field, num2Field;
    private JLabel resultLabel;

    public Calculator() {
        setTitle("Simple Calculator");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 5, 5));

        JLabel num1Label = new JLabel("Number 1:");
        num1Field = new JTextField();

        JLabel num2Label = new JLabel("Number 2:");
        num2Field = new JTextField();

        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");

        resultLabel = new JLabel("Result: ");

        addButton.addActionListener(e -> calculate('+'));
        subtractButton.addActionListener(e -> calculate('-'));
        multiplyButton.addActionListener(e -> calculate('*'));
        divideButton.addActionListener(e -> calculate('/'));

        add(num1Label); add(num1Field);
        add(num2Label); add(num2Field);
        add(addButton); add(subtractButton);
        add(multiplyButton); add(divideButton);
        add(new JLabel()); add(resultLabel);
    }

    private void calculate(char operator) {
        try {
            int a = Integer.parseInt(num1Field.getText());
            int b = Integer.parseInt(num2Field.getText());
            int result = 0;

            switch (operator) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/':
                    if (b == 0) {
                        JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                        return;
                    }
                    result = a / b; break;
            }
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calc = new Calculator();
            calc.setVisible(true);
        });
    }
}
