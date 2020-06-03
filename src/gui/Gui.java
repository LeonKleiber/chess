package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import data.*;

public class Gui extends JFrame implements ActionListener {

    private Bishop bishopBlack = new Bishop(false);

    private JButton buttonA1 = new JButton(bishopBlack.getImage());
    private JButton buttonB1 = new JButton();
    private JButton buttonC1 = new JButton();
    private JButton buttonD1 = new JButton();
    private JButton buttonE1 = new JButton();
    private JButton buttonF1 = new JButton();
    private JButton buttonG1 = new JButton();
    private JButton buttonH1 = new JButton();
    private JButton buttonA2 = new JButton();
    private JButton buttonB2 = new JButton();
    private JButton buttonC2 = new JButton();
    private JButton buttonD2 = new JButton();
    private JButton buttonE2 = new JButton();
    private JButton buttonF2 = new JButton();
    private JButton buttonG2 = new JButton();
    private JButton buttonH2 = new JButton();
    private JButton buttonA3 = new JButton();
    private JButton buttonB3 = new JButton();
    private JButton buttonC3 = new JButton();
    private JButton buttonD3 = new JButton();
    private JButton buttonE3 = new JButton();
    private JButton buttonF3 = new JButton();
    private JButton buttonG3 = new JButton();
    private JButton buttonH3 = new JButton();
    private JButton buttonA4 = new JButton();
    private JButton buttonB4 = new JButton();
    private JButton buttonC4 = new JButton();
    private JButton buttonD4 = new JButton();
    private JButton buttonE4 = new JButton();
    private JButton buttonF4 = new JButton();
    private JButton buttonG4 = new JButton();
    private JButton buttonH4 = new JButton();
    private JButton buttonA5 = new JButton();
    private JButton buttonB5 = new JButton();
    private JButton buttonC5 = new JButton();
    private JButton buttonD5 = new JButton();
    private JButton buttonE5 = new JButton();
    private JButton buttonF5 = new JButton();
    private JButton buttonG5 = new JButton();
    private JButton buttonH5 = new JButton();
    private JButton buttonA6 = new JButton();
    private JButton buttonB6 = new JButton();
    private JButton buttonC6 = new JButton();
    private JButton buttonD6 = new JButton();
    private JButton buttonE6 = new JButton();
    private JButton buttonF6 = new JButton();
    private JButton buttonG6 = new JButton();
    private JButton buttonH6 = new JButton();
    private JButton buttonA7 = new JButton();
    private JButton buttonB7 = new JButton();
    private JButton buttonC7 = new JButton();
    private JButton buttonD7 = new JButton();
    private JButton buttonE7 = new JButton();
    private JButton buttonF7 = new JButton();
    private JButton buttonG7 = new JButton();
    private JButton buttonH7 = new JButton();
    private JButton buttonA8 = new JButton();
    private JButton buttonB8 = new JButton();
    private JButton buttonC8 = new JButton();
    private JButton buttonD8 = new JButton();
    private JButton buttonE8 = new JButton();
    private JButton buttonF8 = new JButton();
    private JButton buttonG8 = new JButton();
    private JButton buttonH8 = new JButton();

    private JButton[] buttonList = {buttonA1, buttonA2, buttonA3, buttonA4, buttonA5, buttonA6, buttonA7, buttonA8,
            buttonB1, buttonB2, buttonB3, buttonB4, buttonB5, buttonB6, buttonB7, buttonB8,
            buttonC1, buttonC2, buttonC3, buttonC4, buttonC5, buttonC6, buttonC7, buttonC8,
            buttonD1, buttonD2, buttonD3, buttonD4, buttonD5, buttonD6, buttonD7, buttonD8,
            buttonE1, buttonE2, buttonE3, buttonE4, buttonE5, buttonE6, buttonE7, buttonE8,
            buttonF1, buttonF2, buttonF3, buttonF4, buttonF5, buttonF6, buttonF7, buttonF8,
            buttonG1, buttonG2, buttonG3, buttonG4, buttonG5, buttonG6, buttonG7, buttonG8,
            buttonH1, buttonH2, buttonH3, buttonH4, buttonH5, buttonH6, buttonH7, buttonH8
    };

    private JPanel buttonPanel = new JPanel(new GridLayout(8, 8));
    private JPanel chessmanPanelWhite = new JPanel(new GridLayout(8, 2));
    private JPanel chessmanPanelBlack = new JPanel(new GridLayout(8, 2));

    private boolean white = true;

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
