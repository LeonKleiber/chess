package data;

import dto.Position;

import java.util.ArrayList;

public class King extends ChessPiece {

    public King(boolean playerOne){
        super("King", playerOne);

    }

    @Override
    public ArrayList<ArrayList<Position>> getMovementOptions(Position position) {
        ArrayList<ArrayList<Position>> positions = new ArrayList<>(1);


        positions = checkMove(position.x-1, position.y + 1, positions);
        positions = checkMove(position.x, position.y + 1, positions);
        positions = checkMove(position.x+1, position.y + 1, positions);
        positions = checkMove(position.x+1, position.y, positions);
        positions = checkMove(position.x+1, position.y - 1, positions);
        positions = checkMove(position.x, position.y - 1 , positions);
        positions = checkMove(position.x-1, position.y - 1, positions);
        positions = checkMove(position.x-1, position.y , positions);

        return positions;
    }

    public ArrayList<ArrayList<Position>> checkMove(int x, int y, ArrayList<ArrayList<Position>> positions){
        ArrayList<Position> p = new ArrayList<>();
        if (!isOutOfBounds(x, y)){
            p.add(new Position(x, y));
            positions.add(p);
        }
        return positions;
    }

    public boolean isOutOfBounds(int x,int y){
        if (x>7 || x<0 || y>7 || y<0) return true;
        else return false;
    }


}
