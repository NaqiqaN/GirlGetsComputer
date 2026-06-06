package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;

public class OBJ_Bag  extends SuperObject{
    
    public OBJ_Bag(GamePanel gp){
        name = "Bag";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/bag.png"));
            uTool.scaleImage(image, gp.tileSize , gp.tileSize );
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

}