import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JPanel {
    labyrinth laberinto = new labyrinth();
    Person person = new Person();

    public Game() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                person.Tecla(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        laberinto.paint(g);
        person.paint(g);
    }

    public static void main(String[] args) {
        JFrame MyWindows = new JFrame("labyrinth");
        Game game = new Game();
        MyWindows.add(game);
        MyWindows.setSize(920, 540);
        MyWindows.setLocation(300, 200);
        MyWindows.setVisible(true);
        MyWindows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    while (true){
        game.repaint();
    }
    }

}