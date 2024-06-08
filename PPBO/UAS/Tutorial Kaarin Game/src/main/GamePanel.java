package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import static utilz.Constants.PlayerConstants.*;
import static utilz.Constants.Direction.*;

public class GamePanel extends JPanel {
    private int xCordinate = 0, yCordinate = 0;
    private MouseInputs mouseInputs;
    private BufferedImage img;
    private BufferedImage subImg;
    private BufferedImage[][] animations;
    private int aniTick, aniIndex, aniSpeed = 15 ;
    private int playerAction = RUNNING;
    private int playerDir = -1;
    private boolean moving = false;


    public GamePanel()  {
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
        setPanelSize();
        importImage();
        loadAnimation();
    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280,768);
        setPreferredSize(size);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.drawImage(animations[playerAction][aniIndex],xCordinate,yCordinate,64,64,null);
    }

    private void updatePos() {
        if (moving){
            switch (playerDir){
                case LEFT :
                    xCordinate -= 3;
                    break;
                case UP :
                    yCordinate -= 3;
                    break;
                case RIGHT:
                    xCordinate += 3;
                    break;
                case DOWN :
                    yCordinate += 3;
                    break;
            }
        }
    }

    public void updateGame(){
        updateAnimationTick();
        setAnimation();
        updatePos();
    }

    private void setAnimation() {
        if (moving){
            playerAction = RUNNING;
        } else {
            playerAction = IDLE;
        }
    }

    private void importImage() {
        InputStream is = getClass().getResourceAsStream("/Main_Char.png");
        try {
            img = ImageIO.read(is);
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

    private void loadAnimation() {
        animations = new BufferedImage[6][12];
        for (int i=0; i<animations.length; i++){
            for(int j=0; j<animations[i].length; j++){
                animations[i][j] = img.getSubimage(j*32, i*32,32,32);
            }
        }
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

    public void setDirection(int direction){
        this.playerDir = direction;
        this.moving = true;
    }
    public void setMove(boolean moving){
        this.moving = moving;
    }

}
