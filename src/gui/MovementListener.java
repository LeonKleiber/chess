package gui;

import dto.Position;
import logic.*;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MovementListener implements ActionListener {

    private final Board board;
    private final Gui gui;

    MovementListener(Board board, Gui gui){
        this.board = board;
        this.gui=gui;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        ChessField fieldBtn = (ChessField) actionEvent.getSource();
        ArrayList<Position> updateFields = board.validateClick(fieldBtn.getPosition());
        ImageIcon image;
        if(board.isMovementOption()){
            image = new ImageIcon(getClass().getResource("/images/Option.png"));
            for (Position field: updateFields){
                gui.getChessField(field).setIcon(image);
            }
        } else {
            for (Position field: updateFields){
                gui.getChessField(field).setIcon(board.getField(field).getImage());
            }
        }

        fieldBtn.setIcon(board.getField(fieldBtn.getPosition()).getImage());
        if (board.hasEnded()){
            gui.displayWinner(board.getWinner());
        }
    }
}
