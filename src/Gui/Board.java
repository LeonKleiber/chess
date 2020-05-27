package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends JFrame implements ActionListener {

    JButton buttonA1 = new JButton();
    JButton buttonB1 = new JButton();
    JButton buttonC1 = new JButton();
    JButton buttonD1 = new JButton();
    JButton buttonE1 = new JButton();
    JButton buttonF1 = new JButton();
    JButton buttonG1 = new JButton();
    JButton buttonH1 = new JButton();
    JButton buttonA2 = new JButton();
    JButton buttonB2 = new JButton();
    JButton buttonC2 = new JButton();
    JButton buttonD2 = new JButton();
    JButton buttonE2 = new JButton();
    JButton buttonF2 = new JButton();
    JButton buttonG2 = new JButton();
    JButton buttonH2 = new JButton();
    JButton buttonA3 = new JButton();
    JButton buttonB3 = new JButton();
    JButton buttonC3 = new JButton();
    JButton buttonD3 = new JButton();
    JButton buttonE3 = new JButton();
    JButton buttonF3 = new JButton();
    JButton buttonG3 = new JButton();
    JButton buttonH3 = new JButton();
    JButton buttonA4 = new JButton();
    JButton buttonB4 = new JButton();
    JButton buttonC4 = new JButton();
    JButton buttonD4 = new JButton();
    JButton buttonE4 = new JButton();
    JButton buttonF4 = new JButton();
    JButton buttonG4 = new JButton();
    JButton buttonH4 = new JButton();
    JButton buttonA5 = new JButton();
    JButton buttonB5 = new JButton();
    JButton buttonC5 = new JButton();
    JButton buttonD5 = new JButton();
    JButton buttonE5 = new JButton();
    JButton buttonF5 = new JButton();
    JButton buttonG5 = new JButton();
    JButton buttonH5 = new JButton();
    JButton buttonA6 = new JButton();
    JButton buttonB6 = new JButton();
    JButton buttonC6 = new JButton();
    JButton buttonD6 = new JButton();
    JButton buttonE6 = new JButton();
    JButton buttonF6 = new JButton();
    JButton buttonG6 = new JButton();
    JButton buttonH6 = new JButton();
    JButton buttonA7 = new JButton();
    JButton buttonB7 = new JButton();
    JButton buttonC7 = new JButton();
    JButton buttonD7 = new JButton();
    JButton buttonE7 = new JButton();
    JButton buttonF7 = new JButton();
    JButton buttonG7 = new JButton();
    JButton buttonH7 = new JButton();
    JButton buttonA8 = new JButton();
    JButton buttonB8 = new JButton();
    JButton buttonC8 = new JButton();
    JButton buttonD8 = new JButton();
    JButton buttonE8 = new JButton();
    JButton buttonF8 = new JButton();
    JButton buttonG8 = new JButton();
    JButton buttonH8 = new JButton();

    JButton[] buttonList = {buttonA1, buttonA2, buttonA3, buttonA4, buttonA5, buttonA6, buttonA7, buttonA8,
            buttonB1, buttonB2, buttonB3, buttonB4, buttonB5, buttonB6, buttonB7, buttonB8,
            buttonC1, buttonC2, buttonC3, buttonC4, buttonC5, buttonC6, buttonC7, buttonC8,
            buttonD1, buttonD2, buttonD3, buttonD4, buttonD5, buttonD6, buttonD7, buttonD8,
            buttonE1, buttonE2, buttonE3, buttonE4, buttonE5, buttonE6, buttonE7, buttonE8,
            buttonF1, buttonF2, buttonF3, buttonF4, buttonF5, buttonF6, buttonF7, buttonF8,
            buttonG1, buttonG2, buttonG3, buttonG4, buttonG5, buttonG6, buttonG7, buttonG8,
            buttonH1, buttonH2, buttonH3, buttonH4, buttonH5, buttonH6, buttonH7, buttonH8
    };

    JPanel buttonPanel = new JPanel(new GridLayout(8, 8));
    JPanel chessmanPanelWhite = new JPanel(new GridLayout(8, 2));
    JPanel chessmanPanelBlack = new JPanel(new GridLayout(8, 2));

    boolean white = true;

    public void buildBoard(){
        setLayout(new BorderLayout());

        for (int i = 0; i < buttonList.length; i++){
            buttonPanel.add(buttonList[i]);
            if(white == true){
                buttonList[i].setBackground(Color.WHITE);
                if(i == 7 || i == 15 || i == 23 || i == 31 || i == 39 || i == 47 || i == 55){
                    white = true;
                }else{
                    white = false;
                }
            } else {
                buttonList[i].setBackground(Color.BLACK);
                if(i == 7 || i == 15 || i == 23 || i == 31 || i == 39 || i == 47 || i == 55){
                    white = false;
                }else{
                    white = true;
                }

            }
            buttonList[i].setOpaque(true);
        }

        add(buttonPanel, BorderLayout.CENTER);
        add(chessmanPanelWhite, BorderLayout.EAST);
        add(chessmanPanelBlack, BorderLayout.WEST);

        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Chess");
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {

    }
}
