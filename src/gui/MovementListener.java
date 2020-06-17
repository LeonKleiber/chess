package gui;

import dto.Position;
import logic.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        Position positionPrevClick = board.validateClick(fieldBtn.getPosition());
        if( positionPrevClick != null){
            gui.getChessField(positionPrevClick).setIcon(board.getField(positionPrevClick).getImage());
            fieldBtn.setIcon(board.getField(fieldBtn.getPosition()).getImage());
        }
        if (board.hasEnded()){
            gui.displayWinner(board.getWinner());
        }
    }
}
