package data;

import dto.Position;

import java.util.ArrayList;

public class Rook extends ChessPiece {

    public Rook(boolean playerOne){
        super("Rook", playerOne);

    }

    @Override
    public ArrayList<ArrayList<Position>> getMovementOptions(Position position) {
        ArrayList<ArrayList<Position>> positions = new ArrayList<ArrayList<Position>>();
        ArrayList<Position> fw = new ArrayList<Position>();
        ArrayList<Position> ri = new ArrayList<>();
        ArrayList<Position> bw = new ArrayList<Position>();
        ArrayList<Position> le = new ArrayList<Position>();
        for (int i = position.x; i < 7; i++) {
            fw.add(new Position(i + 1, position.y));
            System.out.println(( i + 1) + " und " + position.y);
        }

        for(int i = position.x; i > 0; i--){
            bw.add(new Position(i-1, position.y));
            System.out.println((i-1) +" und "+position.y);
        }

        for (int i = position.y; i < 7; i++) {
            le.add(new Position(position.x, i + 1));
            System.out.println(position.x + " und " + (i + 1));
        }

        for(int i = position.y; i > 0; i--){
            ri.add(new Position(position.x, i - 1));
            System.out.println(position.x + " und " + (i - 1));
        }
        positions.add(fw);
        positions.add(bw);
        positions.add(le);
        positions.add(ri);
        return positions;
    }
}