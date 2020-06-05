package logic;

import dto.Position;

public class Board {

    Field [][] fields;

    TurnManager turnManager;


    public Board(){
        fields = new StartPosition().getFields();
        turnManager = new TurnManager();
    }

    public Field getField(Position position) {
        return fields[position.y][position.x];
    }

    public Position validateClick(Position position) {
        turnManager.click(getField(position));
        return turnManager.getStartFieldPosition();
    }
}
