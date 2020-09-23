package ru.mirea.ikbo2519.pr4.part1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{

    private int a, b;
    private String last="N/A", result="DRAW";

    public void result(String e) {
        if (a>b) {
            this.result="AC Milan";
        }
        else if (a==b) {
            this.result="DRAW";
        }
        else {
            this.result="Real Madrid";
        }
    }

    public void lastScorer(String e) {
        this.last = e;
    }

    public void incValue(String e) {
        if (e.equals("AC Milan")){
            a++;
        }
        else{
            b++;
        }
    }

    public void createGUI(){
        setTitle("FOOTBAL SCORER");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel grid = new JPanel();
        GridLayout layout = new GridLayout(3, 3, 20, 12);
        grid.setLayout(layout);
        // Создание панели с двумя кнопками
        //JPanel contents = new JPanel();
        JButton buttonA = new JButton("AC Milan");
        JButton buttonB = new JButton("Real Madrid");
        buttonA.addActionListener(new ListenerAction());
        buttonB.addActionListener(new ListenerAction());
        grid.add(buttonA);
        grid.add(buttonB);
        grid.add(new JLabel("Last Scorer:" + this.last));
        grid.add(new JLabel("Winner:" + this.result));
        grid.add(new JLabel("Result:" + this.a + "x" + this.b));
        setContentPane(grid);
        setSize(500, 200);
        setVisible(true);
    }

    class ListenerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            incValue(e.getActionCommand());
            lastScorer(e.getActionCommand());
            result(e.getActionCommand());
            createGUI();
        }
    }
}
