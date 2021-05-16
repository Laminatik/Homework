package ru.geekbrains.java1.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
   private int value;
   private int newValue;

   public CounterApp(int initialValue, int addValue) {
       setBounds(500, 500, 300, 170);
       setTitle("Simple Counter");
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setAlwaysOnTop(true);

       Font font = new Font("Arial", Font.BOLD, 32);

       JLabel counterValueView = new JLabel(String.valueOf(value));
       counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
       counterValueView.setFont(font);
       add(counterValueView, BorderLayout.CENTER);

       value = initialValue;
       refreshCounterLabel(counterValueView);

       newValue = addValue;
       refreshCounterLabel(counterValueView);

       JButton decrementButton = new JButton("<");
       add(decrementButton, BorderLayout.LINE_START);
       decrementButton.setFont(font);

       JButton incrementButton = new JButton(">");
       add(incrementButton, BorderLayout.LINE_END);
       incrementButton.setFont(font);

       JButton resetButton = new JButton("clear");
       add(resetButton, BorderLayout.SOUTH);
       resetButton.setFont(font);

       JTextField valueButton = new JTextField();
       add(valueButton, BorderLayout.PAGE_START);
       valueButton.setFont(font);

       decrementButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               value = value - newValue;
               refreshCounterLabel(counterValueView);
           }
       });

       incrementButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               value = value + newValue;
               refreshCounterLabel(counterValueView);
           }
       });

       resetButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               value = 0;
               refreshCounterLabel(counterValueView);
           }
       });

       valueButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               System.out.println("Set value: " + valueButton.getText());
               newValue = Integer.parseInt(valueButton.getText());
               valueButton.setText(null);
           }
       });

       setVisible(true);
   }

    private void refreshCounterLabel(JLabel counterValueView) {
        counterValueView.setText(String.valueOf(value));
    }

    public static void main(String[] args) {
       new CounterApp(0, 1);
   }
}

