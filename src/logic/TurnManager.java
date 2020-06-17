package logic;

import data.ChessPiece;
import data.King;
import dto.Position;

import java.util.ArrayList;

public class TurnManager {

    private boolean firstClickInTurn = true;
    private boolean turnPlayerOne = true;
    private Field startField;
    private Field activeField;
    private Field kingOne;
    private Field kingTwo;
    private Board board;
    ArrayList<ArrayList<Position>> movementOptions;

    public TurnManager(Board b){
        board= b;
    }

    public void click(Field field){
        activeField = field;
        if(firstClickInTurn){
            if(validateFirstClick()){
                firstClick();
                validClick();
            } else {
                invalidClick();
            }
        } else {
            if (validateSecondClick()){
                secondClick();
                validClick();

            } else{
                invalidClick();
            }
        }
    }

    private void secondClick() {
        boolean kingMoved = false;
        ChessPiece activePiece = startField.getChessPiece();
        if(activePiece instanceof King){
            kingMoved = true;
            moveKing(activePiece);
        }
        startField.moveAway();
        if (!kingMoved){
            checkIfKingDied();
        }
        activeField.moveHere(activePiece);
    }

    private void checkIfKingDied() {
        if(activeField.equals(kingOne)){
            board.endGame(Winner.PLAYER2);
        } else if (activeField.equals(kingTwo)){
            board.endGame(Winner.PLAYER1);
        }
    }

    private void moveKing(ChessPiece activePiece) {
        if (activePiece.isPlayerOne()){
            kingOne = activeField;
        } else {
            kingTwo = activeField;
        }
    }

    public void firstClick() {
        startField = activeField;       movementOptions = startField.getMovementOptions(board);
    }


    public Position getStartFieldPosition() {
        if (startField!= null){
            return startField.getPosition();
        }
        return null;
    }

    public void validClick(){
        if(!firstClickInTurn){
            turnPlayerOne = !turnPlayerOne;
        }
        firstClickInTurn = !firstClickInTurn;
    }
    public void invalidClick(){
        firstClickInTurn=true;
    }

    public boolean validateFirstClick() {
        if (activeField.getChessPiece()!= null && turnPlayerOne == activeField.getChessPiece().isPlayerOne()){
            return true;
        }
        return false;
    }

    public boolean validateSecondClick() {
        Position position = activeField.getPosition();
        for (ArrayList<Position> row: movementOptions){
            for ( Position option : row) {
                if (position.x == option.x && position.y == option.y) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setKingOne(Field kingOne) {
        this.kingOne = kingOne;
    }

    public void setKingTwo(Field kingTwo) {
        this.kingTwo = kingTwo;
    }
}
