package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GamePanel extends JPanel {
    private int xCordinate = 0, yCordinate = 0;
    private MouseInputs mouseInputs;
    private BufferedImage img;
    private BufferedImage subImg;


    public GamePanel()  {
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
        setPanelSize();
        importImage();
    }

    private void importImage() {
        InputStream is = getClass().getResourceAsStream("/Warrior_blue.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280,768);
        setPreferredSize(size);
    }

    public void changeX(int x){
        this.xCordinate += x;
    }
    public void changeY(int y){
        this.yCordinate += y;
    }
    public void setRectPos (int x, int y){
        this.xCordinate = x;
        this.yCordinate = y;
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        subImg = img.getSubimage(3*192,6*192,192,192);
        g.drawImage(subImg ,xCordinate,yCordinate,96,96,null);
    }

}
