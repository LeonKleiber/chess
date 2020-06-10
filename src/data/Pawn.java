package data;

import dto.Position;

import java.util.ArrayList;

public class Pawn extends ChessPiece {

    boolean firstMove;

    public Pawn(boolean playerOne){
        super("Pawn", playerOne);
        firstMove = true;
    }

    @Override
    public ArrayList<ArrayList<Position>> getMovementOptions(Position position) {
        ArrayList<ArrayList<Position>> positions = new ArrayList<>(3);
        int y;
        if (isPlayerOne()){
            y = position.y +1;
        } else {
            y = position.y-1;
        }

        ArrayList<Position> killMoves= new ArrayList<>(2);
        killMoves.add(new Position(position.x+1,y));
        killMoves.add(new Position(position.x-1,y));
        positions.add(killMoves);

        ArrayList<Position> moves = new ArrayList<>();
        moves.add(new Position(position.x, y));
        if (firstMove){
            firstMove = false;
            if (isPlayerOne()){
                y = position.y +2;
            } else {
                y = position.y-2;
            }
            moves.add(new Position(position.x, y));
        }
        positions.add(moves);


        return positions;
    }
}
