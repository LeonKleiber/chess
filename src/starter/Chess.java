package starter;


import data.Rook;
import dto.Position;
import gui.Gui;

public class Chess {
    public static void main(String[] args) {
        //new Gui().buildBoard();
        new Rook(true).getMovementOptions(new Position(6, 2));
    }
}
