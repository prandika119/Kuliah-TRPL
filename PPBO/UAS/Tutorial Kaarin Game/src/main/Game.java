package main;

public class Game implements Runnable{
    private GameWindow gameWindow;
    private GamePanel gamePanel;
    private Thread gameThread;
    private final int fps = 120;
    private final int ups = 200;
    public Game(){
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
        gamePanel.requestFocus();
        startGameLoop();

    }
    public void startGameLoop(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    public void update(){
        gamePanel.updateGame();
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
//            if(now - lastFrame >= timePerFrame){
//                gamePanel.repaint();
//                lastFrame = now;
//                frames++;
//            }
            if(System.currentTimeMillis() - lastCheck >= 1000){
                System.out.println("FPS: " + frames + " UPS: " + updates);
                frames = 0;
                updates = 0;
                lastCheck = System.currentTimeMillis();
            }
        }
    }
}
