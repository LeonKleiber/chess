package data;

import dto.Position;
import javax.swing.*;
import java.util.ArrayList;


public abstract class ChessPiece {

    private ImageIcon image;
    private boolean playerOne;

    public ChessPiece(String imageName, boolean playerOne){
        this.playerOne = playerOne;
        this.image = createImageFromName(imageName);
    }

    private ImageIcon createImageFromName(String imageName) {
        String path = "images/player";

        if(playerOne) {
            path += "One";
        } else {
            path += "Two";
        }

        path += "/"+ imageName + ".png";
        System.out.println(path);
        return new ImageIcon(path);

    }


    public abstract ArrayList<ArrayList<Position>> getMovementOptions(Position position);

    public ImageIcon getImage(){
        return image;
    }

    public boolean isPlayerOne() {
        return playerOne;
    }

}
