package data;

import javax.swing.*;
import javax.swing.text.Position;


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


    public abstract Position[] movementOption(Position position);

    public ImageIcon getImage(){
        return image;
    }

    public boolean isPlayerOne() {
        return playerOne;
    }
}