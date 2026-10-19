package main;

import object.OBJ_Computer;
import object.OBJ_Door;
import object.OBJ_Key;
import object.OBJ_Bag;

public class AssetSetter {
    GamePanel gp ;
    public AssetSetter(GamePanel gp){
        this.gp =gp;
    }

    public void setObject(){
        gp.obj[0]=new OBJ_Key(gp);
        gp.obj[0].worldX = 9 * gp.tileSize;
        gp.obj[0].worldY = 15 * gp.tileSize;

        gp.obj[1]=new OBJ_Key(gp);
        gp.obj[1].worldX = 10 * gp.tileSize;
        gp.obj[1].worldY = 33 * gp.tileSize;

        gp.obj[2]=new OBJ_Key(gp);
        gp.obj[2].worldX = 41 * gp.tileSize;
        gp.obj[2].worldY = 38 * gp.tileSize;

        gp.obj[3]=new OBJ_Door(gp);
        gp.obj[3].worldX = 44 * gp.tileSize;
        gp.obj[3].worldY = 15 * gp.tileSize;

        gp.obj[4]=new OBJ_Door(gp);
        gp.obj[4].worldX = 38 * gp.tileSize;
        gp.obj[4].worldY = 22 * gp.tileSize;

        gp.obj[5]=new OBJ_Door(gp);
        gp.obj[5].worldX = 39 * gp.tileSize;
        gp.obj[5].worldY = 27 * gp.tileSize;


        gp.obj[6]=new OBJ_Computer(gp);
        gp.obj[6].worldX = 47 * gp.tileSize;
        gp.obj[6].worldY = 15 * gp.tileSize;

        gp.obj[7]=new OBJ_Bag(gp);
        gp.obj[7].worldX = 23 * gp.tileSize;
        gp.obj[7].worldY = 33 * gp.tileSize;


    }


}
