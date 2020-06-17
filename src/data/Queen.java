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

        int y = position.y;
        for (int i = position.x; i < 7; i++) {
            if(y < 7 && y >= 0) {
                fl.add(new Position(i + 1, y + 1));
                y++;
            }
        }

        y = position.y;
        for(int i = position.x; i > 0; i--){
            if(y < 7 && y >= 0) {
                fr.add(new Position(i - 1, y + 1));
                y++;
            }
        }

        y = position.y;
        for (int i = position.x; i < 7; i++) {
            if(y <= 7 && y > 0) {
                bl.add(new Position(i + 1, y - 1));
                y--;
            }
        }

        y = position.y;
        for(int i = position.x; i > 0; i--){
            if(y <= 7 && y > 0) {
                br.add(new Position(i - 1, y - 1));
                y--;
            }
        }

        for (int i = position.x; i < 7; i++) {
            fl.add(new Position(i + 1, position.y));
        }

        for(int i = position.x; i > 0; i--){
            fr.add(new Position(i-1, position.y));
        }

        for (int i = position.y; i < 7; i++) {
            bl.add(new Position(position.x, i + 1));
        }

        for(int i = position.y; i > 0; i--){
            br.add(new Position(position.x, i - 1));
        }

        positions.add(fl);
        positions.add(fr);
        positions.add(bl);
        positions.add(br);
        positions.add(f);
        positions.add(b);
        positions.add(l);
        positions.add(r);
        return positions;
    }
}
