package logic;

import data.ChessPiece;
import dto.Position;

public class Board {

    Field [][] fields;

    TurnManager turnManager ;

    Field movingField;

    Position[] movementOption;

    public Board(){
        fields = new StartPosition().getFields();
        turnManager = new TurnManager();
    }

    public Field getField(Position position) {
        return fields[position.y][position.x];
    }

    public Position validateClick(Position position) {
        boolean valid;
        boolean repaint = false;
        if(turnManager.isFirstClickInTurn()){
            if(turnManager.validateFirstClick(getField(position))){
                movingField = getField(position);
                valid= true;
            } else {
                valid = false;
            }
        } else {
            if (turnManager.validateSecondClick(getField(position), movementOption)){
                valid=true;
                ChessPiece activePiece = movingField.getChessPiece();
                movingField.moveAway();
                getField(position).moveHere(activePiece);
                repaint= true;
            } else{
                valid = false;
            }
        }

        if (valid){
            turnManager.validClick();
        } else {
            System.out.println("invalid");
            turnManager.invalidClick();
        }

        if (repaint){
            return movingField.getPosition();
        }
        else {
            return null;
        }

    }
}
