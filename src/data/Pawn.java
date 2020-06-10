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
            if (y>7){
                return positions;
            }
        } else {
            y = position.y-1;
            if (y<0){
                return positions;
            }
        }

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

        ArrayList<Position> killMoves= new ArrayList<>(2);
        if (position.x +1 <= 7){
            killMoves.add(new Position(position.x+1,y));
        }
        if (position.x-1>=0){
            killMoves.add(new Position(position.x-1,y));
        }
        positions.add(killMoves);

        return positions;
    }
}
