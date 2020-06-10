package data;

import dto.Position;

import java.util.ArrayList;

public class Knight extends ChessPiece {

    public Knight(boolean playerOne){
        super("Knight", playerOne);

    }

    @Override
    public ArrayList<ArrayList<Position>> getMovementOptions(Position position) {
        ArrayList<ArrayList<Position>> p = new ArrayList<>(1);
        ArrayList<Position> positions = new ArrayList<>();

        positions = checkMove(position.x+1, position.y + 2, positions);
        positions = checkMove(position.x+2, position.y + 1, positions);
        positions = checkMove(position.x+2, position.y - 1, positions);
        positions = checkMove(position.x+1, position.y - 2, positions);
        positions = checkMove(position.x-1, position.y - 2, positions);
        positions = checkMove(position.x-2, position.y - 1 , positions);
        positions = checkMove(position.x-2, position.y + 1, positions);
        positions = checkMove(position.x-1, position.y + 2, positions);

        p.add(positions);
        return p;
    }

    public ArrayList<Position> checkMove(int x, int y, ArrayList<Position> positions){
        if (!isOutOfBounds(x, y)){
            positions.add(new Position(x, y));
        }
        return positions;
    }

    public boolean isOutOfBounds(int x,int y){
        if (x>7 || x<0 || y>7 || y<0) return true;
        else return false;
    }
}
