package logic;

import dto.Position;

import java.util.ArrayList;

public class Board {

    private Field [][] fields;

    private TurnManager turnManager;

    private boolean gameOver = false;

    private Winner winner;

    public Board(){
        StartPosition startPosition = new StartPosition();
        fields = startPosition.getFields();
        turnManager = new TurnManager(this);
        turnManager.setKingOne(startPosition.getKingOne());
        turnManager.setKingTwo(startPosition.getKingTwo());
    }

    public Field getField(Position position) {
        return fields[position.y][position.x];
    }

    public ArrayList<Position> validateClick(Position position) {
        turnManager.click(getField(position));
        return turnManager.getReturnPositions();
    }

    public void endGame(Winner winner) {
        this.winner = winner;
        gameOver = true;
    }

    public boolean hasEnded(){
        return gameOver;
    }

    public Winner getWinner() {
        return winner;
    }


    public boolean isMovementOption() {
        return turnManager.isMovementOptions();
    }
}
