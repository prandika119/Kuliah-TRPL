package entity;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import static utilz.Constants.Direction.*;
import static utilz.Constants.Direction.DOWN;
import static utilz.Constants.PlayerConstants.*;

public class Player extends Entity {
    private BufferedImage[][] animations;
    private int aniTick, aniIndex, aniSpeed = 15 ;
    private int playerAction = RUNNING;
    private int playerDir = -1;
    private boolean moving = false;
    private boolean left, up, right, down;
    private float playerSpeed = 1.5f;

    public void resetDirBoolean() {
        left = false;
        right = false;
        up = false;
        down = false;
    }

    public boolean isLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isDown() {
        return down;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public Player(float x, float y){
        super(x,y);
        loadAnimation();
    }
    public void update(){
        updatePos();
        updateAnimationTick();
        setAnimation();
    }
    public void render(Graphics g){
        g.drawImage(animations[playerAction][aniIndex], (int)x, (int)y,64,64,null);
    }

    public void setDirection(int direction){
        this.playerDir = direction;
        this.moving = true;
    }
    public void setMove(boolean moving){
        this.moving = moving;
    }

    private void updateAnimationTick() {
        aniTick++;
        if(aniTick >= aniSpeed){
            aniTick = 0;
            aniIndex++;
            if(aniIndex >= GetSpiritAmount(playerAction)){
                aniIndex = 0;
            }
        }
    }

    private void setAnimation() {
        if (moving){
            playerAction = RUNNING;
        } else {
            playerAction = IDLE;
        }
    }


    private void updatePos() {
        moving = false;
        if (left && !right) {
            x -= playerSpeed;
            moving = true;
        } else if (right && !left) {
            x += playerSpeed;
            moving = true;
        }
        if (up && !down) {
            y -= playerSpeed;
            moving = true;
        } else if (down && !up) {
            y += playerSpeed;
            moving = true;
        }
    }

    private void loadAnimation() {
        InputStream is = getClass().getResourceAsStream("/Main_Char.png");
        try {
            BufferedImage img = ImageIO.read(is);
            animations = new BufferedImage[6][12];
            for (int i=0; i<animations.length; i++){
                for(int j=0; j<animations[i].length; j++){
                    animations[i][j] = img.getSubimage(j*32, i*32,32,32);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


}
