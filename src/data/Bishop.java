package data;

import dto.Position;

import java.util.ArrayList;

public class Bishop extends ChessPiece {

    public Bishop(boolean playerOne){
        super("Bishop", playerOne);

    }

    @Override
    public ArrayList<ArrayList<Position>> getMovementOptions(Position position) {
        ArrayList<ArrayList<Position>> positions = new ArrayList<ArrayList<Position>>();
        ArrayList<Position> fl = new ArrayList<Position>();
        ArrayList<Position> fr = new ArrayList<Position>();
        ArrayList<Position> bl = new ArrayList<Position>();
        ArrayList<Position> br = new ArrayList<Position>();
         /*   for (int i = position.x; i < 7; i++) {
                fl.add(new Position(i + 1, position.y));
                System.out.println(( i + 1) + " und " + position.y);
            }

            for(int i = position.x; i > 0; i--){
                fr.add(new Position(i-1, position.y));
                System.out.println((i-1) +" und "+position.y);
            }

            for (int i = position.y; i < 7; i++) {
                bl.add(new Position(position.x, i + 1));
                System.out.println(position.x + " und " + (i + 1));
            }

            for(int i = position.y; i > 0; i--){
                br.add(new Position(position.x, i - 1));
                System.out.println(position.x + " und " + (i - 1));
            }
            positions.add(fw);
            positions.add(bw);
            positions.add(le);
            positions.add(ri);
        }*/
        return positions;
    }

}
