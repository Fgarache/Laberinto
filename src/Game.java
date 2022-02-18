import javax.swing.*;
import java.awt.*;

public class Game extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    public static void main(String[] args) {
        JFrame MyWindows = new JFrame("labyrinth");
        Game game = new Game();
        MyWindows.add(game);
        MyWindows.setSize(920, 540);
        MyWindows.setLocation(300, 200);
        MyWindows.setVisible(true);
        MyWindows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
