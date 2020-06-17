package gui;

import dto.Position;
import logic.Board;
import logic.Field;
import logic.Winner;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {


    private String Player1 = "player 1";
    private String Player2 = "player 2";

    private Board board = new Board();

    private ChessField[][] buttonList = new ChessField[8][8];

    private JPanel buttonPanel = new JPanel(new GridLayout(8, 8));
    //private JPanel chessmanPanelWhite = new JPanel(new GridLayout(8, 2));
    //private JPanel chessmanPanelBlack = new JPanel(new GridLayout(8, 2));



    public void buildBoard(){
        setLayout(new BorderLayout());

        Color btnColor;
        for (int y = buttonList.length -1; y >=0 ; y--) {
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
                buttonList[y][x] = createButton(x,y,btnColor);
            }
        }

        add(buttonPanel, BorderLayout.CENTER);
        //add(chessmanPanelWhite, BorderLayout.EAST);
        //add(chessmanPanelBlack, BorderLayout.WEST);

        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Chess");
        setLocationRelativeTo(null);
    }

    private ChessField createButton(int x, int y, Color c) {
        ChessField fieldBtn;
        Position p = new Position(x,y);
        ImageIcon icon = board.getField(p).getImage();
        fieldBtn = new ChessField(p, c, icon);
        fieldBtn.addActionListener(new MovementListener(board, this));
        buttonPanel.add(fieldBtn);

        return fieldBtn;
    }

    public void close() {
        setVisible(false);
        dispose();
    }

    public ChessField getChessField(Position p) {
        return buttonList[p.y][p.x];
    }

    public void displayWinner(Winner winner) {
        new EndScreen(this, "Game over", getMessage(winner));
    }

    private String getMessage(Winner winner) {
        String message = "And the winner is ";
        switch (winner){
            case PLAYER1:
                return message + this.Player1;
            case PLAYER2:
                return message + this.Player2;
            case DRAW:
                return "It's a draw";
            default:
                throw new IllegalArgumentException();
        }

    }
}
