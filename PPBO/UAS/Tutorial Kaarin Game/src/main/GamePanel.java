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
    private MouseInputs mouseInputs;
    private Game game;


    public GamePanel(Game game)  {
        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
        setPanelSize();
        this.game = game;
    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280,768);
        setPreferredSize(size);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        game.render(g);
    }

    public Game getGame(){
        return game;
    }


    public void updateGame(){
    }




}
