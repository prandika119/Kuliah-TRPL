package main;

import entity.Player;

import java.awt.*;

public class Game implements Runnable{
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private Thread gameThread;
    private final int fps = 120;
    private final int ups = 200;

    private Player player;

    public Game(){
        initClasses();
        gamePanel = new GamePanel(this);
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();
        startGameLoop();

    }

    private void initClasses() {
        player = new Player(100, 100);
    }

    public void startGameLoop(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    public void update(){
        player.update();
    }

    public void render(Graphics g){
        player.render(g);

    }

    @Override
    public void run() {
        double timePerFrame = 1000000000.0/fps;
        double timePerUpdate = 1000000000.0/ups;

        long previousTime = System.nanoTime();

        int frames = 0;
        int updates = 0;
        long lastCheck = System.currentTimeMillis();

        double deltaU = 0;
        double deltaF = 0;

        while (true){

            long currentTime = System.nanoTime();

            deltaU += (currentTime - previousTime) / timePerUpdate;
            deltaF += (currentTime - previousTime) / timePerFrame;
            previousTime = currentTime;

            if (deltaU >= 1){
                update();
                updates++;
                deltaU--;
            }

            if (deltaF >= 1){
                gamePanel.repaint();
                frames++;
                deltaF--;
            }

            if(System.currentTimeMillis() - lastCheck >= 1000){
                System.out.println("FPS: " + frames + " UPS: " + updates);
                frames = 0;
                updates = 0;
                lastCheck = System.currentTimeMillis();
            }
        }
    }

    public Player getPlayer() {
        return player;
    }

    public void windowFocusLost() {
        player.resetDirBoolean();
    }
}
