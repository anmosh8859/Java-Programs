import java.applet.Applet;
import java.awt.Graphics;

class SimpleApplet extends Applet{
    public void paint(Graphics g){
        g.drawString("A Simple Applet", 100, 100);
    }
}