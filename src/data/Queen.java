package data;

import dto.Position;

import java.util.ArrayList;

public class Queen extends ChessPiece {

    public Queen(boolean playerOne){
        super("Queen", playerOne);

    }

    @Override
    public ArrayList<ArrayList<Position>> getMovementOptions(Position position) {
        ArrayList<ArrayList<Position>> positions = new ArrayList<ArrayList<Position>>();
        ArrayList<Position> fl = new ArrayList<Position>();
        ArrayList<Position> fr = new ArrayList<Position>();
        ArrayList<Position> bl = new ArrayList<Position>();
        ArrayList<Position> br = new ArrayList<Position>();
        ArrayList<Position> f = new ArrayList<Position>();
        ArrayList<Position> b = new ArrayList<Position>();
        ArrayList<Position> l = new ArrayList<Position>();
        ArrayList<Position> r = new ArrayList<Position>();
        return positions;
    }
}
