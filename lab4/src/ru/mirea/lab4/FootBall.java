package ru.mirea.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class FootBall extends JFrame {
    public int x = 0;
    public int y = 0;
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel lbl1 = new JLabel("Result: 0 X 0");
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    Label lbl3 = new Label("Winner: DRAW");
    public FootBall(){
        super("AC Milan vs Real Madrid");
        setSize(600,600);
        setLayout(new BorderLayout());
        add(lbl1, BorderLayout.NORTH);
        add(lbl2, BorderLayout.CENTER);
        add(lbl3, BorderLayout.SOUTH);
        add(but1, BorderLayout.WEST);
        add(but2, BorderLayout.EAST);

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = x + 1;
                lbl1.setText("Result: " + x + " X "+ y);
                lbl2.setText("Last Scorer: AC Milan");
                if (x < y)
                    lbl3.setText("Winner: Real Madrid");
                else if (x > y)
                    lbl3.setText("Winner: AC Milan");
                else if (x == y)
                    lbl3.setText("Winner: DRAW");
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                y = y + 1;
                lbl1.setText("Result: " + x + " X "+ y);
                lbl2.setText("Last Scorer: Real Madrid");
                if (x < y)
                    lbl3.setText("Winner: Real Madrid");
                else if (x > y)
                    lbl3.setText("Winner: AC Milan");
                else if (x == y)
                    lbl3.setText("Winner: DRAW");
            }
        });
        but1.setSize(100,100);
        but2.setSize(100,100);
        lbl1.setHorizontalAlignment(JLabel.CENTER);
        lbl2.setHorizontalAlignment(JLabel.CENTER);
        lbl3.setAlignment(Label.CENTER);
    }

    public static void main(String[] args) {
        new FootBall().setVisible(true);
    }
}
