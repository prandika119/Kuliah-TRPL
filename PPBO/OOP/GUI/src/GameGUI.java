import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameGUI extends JFrame implements KeyListener{
    private JLabel backgroundLabel;
    private JLabel characterLabel;
    private JLabel textLabel;
    private int characterx;
    private int charactery;
    public GameGUI(){
        setTitle("Game Zombie");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);


        characterx = 100;
        charactery = 450;


        //Masukkan image ke label > setbounds label > add label to jframe
        ImageIcon bacgroundImage = new ImageIcon("src/asset/background.jpg");
        backgroundLabel = new JLabel(bacgroundImage);
        backgroundLabel.setBounds(0,0,800, 600);
        add(backgroundLabel);

        ImageIcon charImage = new ImageIcon("src/asset/char1.png");
        characterLabel = new JLabel(charImage);
        characterLabel.setBounds(characterx,charactery,100, 67);
        backgroundLabel.add(characterLabel);

        textLabel = new JLabel("Hello, welcome to my game!");
        textLabel.setFont(new Font("Arial", Font.BOLD, 24));
        textLabel.setForeground(Color.white);
        textLabel.setBounds(300,50,400,30);
        backgroundLabel.add(textLabel);

        addKeyListener(new KeyListener());
        @Override
        public void keyTyped(KeyEvent e) {
        };

        @Override
        public void keyPressed(KeyEvent e){
            int keycode = e.getKeyCode();
            switch (keycode){
                case KeyEvent.VK_W:
                    charactery -= 10;
                    break;
                case KeyEvent.VK_S :
                    charactery += 10;
                    break;
                case KeyEvent.VK_A :
                    characterx -= 10;
                    break;
                case KeyEvent.VK_D :
                    characterx += 10;
                    break;
            }
            characterLabel.setLocation(CharacterX, CharacterY);

        };
        @Override
        public void keyReleased (KeyEvent e){

        }
        setVisible(true);;
    }
}
