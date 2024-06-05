package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel {
    private float xCordinate = 100, yCordinate = 100;
    private float xDir = 0.1f, yDir = 0.1f;
    private MouseInputs mouseInputs;
    private int frame;
    private long lastCheck;
    private Color color = new Color(22,33,123);
    private Random random;



    public GamePanel()  {
        random = new Random();
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

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
        updateRect();
        g.setColor(color);
        g.fillRect((int)xCordinate,(int)yCordinate,50,100);
        frame++;
        if(System.currentTimeMillis() - lastCheck >= 1000){
            lastCheck = System.currentTimeMillis();
            System.out.println("Frame : " + frame);
            frame = 0;
        }
        repaint();
    }

    private void updateRect() {
        xCordinate += xDir;
        if(xCordinate>400 || xCordinate<0){
            xDir *= -1;
            color = getRandomColor();
        }
        yCordinate += yDir;
        if(yCordinate>400 || yCordinate<0){
            yDir *= -1;
            color = getRandomColor();
        }
    }

    private Color getRandomColor() {
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r,g,b);
    }
}
