import java.awt.*;
import java.awt.event.KeyEvent;

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

    public void Tecla (KeyEvent evento){
        if (evento.getKeyCode() == 37) {
            System.out.println("izquierda");
            x = x-movimiento;

        }
        if (evento.getKeyCode() == 39) {
            System.out.println("derecha");
            x = x+movimiento;
        }
        if (evento.getKeyCode() == 40) {
            System.out.println("abajo");
            y= y+movimiento;
        }
        if (evento.getKeyCode() == 38) {
            System.out.println("arriba");
            y= y-movimiento;
        }
    }
}
