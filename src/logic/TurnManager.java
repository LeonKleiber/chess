package logic;

import data.ChessPiece;
import dto.Position;

import java.util.ArrayList;

public class TurnManager {

    private boolean firstClickInTurn = true;
    private boolean turnPlayerOne = true;
    private Field startField;
    private Field activeField;
    ArrayList<ArrayList<Position>> movementOptions;

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
        ChessPiece activePiece = startField.getChessPiece();
        startField.moveAway();
        activeField.moveHere(activePiece);
    }

    public void firstClick() {
        startField = activeField;
        movementOptions = startField.getMovementOptions();
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
}
