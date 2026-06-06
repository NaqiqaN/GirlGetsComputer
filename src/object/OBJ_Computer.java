package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Computer extends SuperObject {
     public OBJ_Computer(GamePanel gp){
        name = "Computer";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/computer.png"));
            uTool.scaleImage(image, gp.tileSize , gp.tileSize);
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

}
