package gui;

import dto.Position;
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
        System.out.println(actionEvent.getSource().getClass().toString());
        ChessField fieldBtn = (ChessField) actionEvent.getSource();
        System.out.println(fieldBtn.position.x +" und " +fieldBtn.position.y);

    }
}
