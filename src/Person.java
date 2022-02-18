import java.awt.*;

public class Person {
    private int x=40;
    private int y=40;
    private final int ancho=40;
    private final int alto=40;
    private final int movimiento=40;

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(x,y,ancho,alto);
        g.setColor(Color.black);
        g.drawOval(x,y,ancho,alto);

    }

}
