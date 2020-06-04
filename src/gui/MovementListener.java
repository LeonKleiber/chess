package gui;

import logic.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovementListener implements ActionListener {

    private final Board board;

    MovementListener(Board board){
        this.board = board;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        ChessField fieldBtn = (ChessField) actionEvent.getSource();
        Field field = board.getField(fieldBtn.getPosition());
        ImageIcon image = field.getImage();
        System.out.println();
    }
}
