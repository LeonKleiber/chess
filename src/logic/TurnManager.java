package logic;

import dto.Position;

public class TurnManager {

    private boolean firstClickInTurn = true;
    private boolean turnPlayerOne = true;


    public boolean isFirstClickInTurn() {
        return firstClickInTurn;
    }

    public boolean isTurnPlayerOne() {
        return turnPlayerOne;
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

    public boolean validateFirstClick(Field field) {
        if (field.getChessPiece()!= null && turnPlayerOne == field.getChessPiece().isPlayerOne()){
            return true;
        }
        return false;
    }

    public boolean validateSecondClick(Field field, Position[] movementOptions) {
        Position position = field.getPosition();
        for (Position option : movementOptions){
            System.out.println(option);
            if (position.x == option.x && position.y == option.y){
                return true;
            }
        }
        return false;
    }
}
