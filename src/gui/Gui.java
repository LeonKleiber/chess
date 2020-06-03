package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import data.*;

public class Gui extends JFrame implements ActionListener {


    private JButton[][] buttonList = new JButton[8][8];

    private JPanel buttonPanel = new JPanel(new GridLayout(8, 8));
    private JPanel chessmanPanelWhite = new JPanel(new GridLayout(8, 2));
    private JPanel chessmanPanelBlack = new JPanel(new GridLayout(8, 2));



    public void buildBoard(){
        setLayout(new BorderLayout());

        Color btnColor;
        for (int y = 0; y < buttonList.length; y++) {
            for (int x = 0; x < buttonList[y].length; x++) {
                if (y%2 == 0){
                    if (x %2 == 0) {
                        btnColor = Color.BLACK;
                    } else {
                        btnColor = Color.WHITE;
                    }
                } else {
                    if (x %2 == 0) {
                        btnColor = Color.WHITE;
                    } else {
                        btnColor = Color.BLACK;
                    }
                }
                buttonList[y][x] = createButton(btnColor);
            }
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

    private JButton createButton(Color color) {
        JButton newBtn = new JButton();
        newBtn.setBackground(color);
        newBtn.setOpaque(true);
        buttonPanel.add(newBtn);
        return newBtn;
    }

    public void actionPerformed(ActionEvent e) {

    }
}
