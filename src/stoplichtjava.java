import java.awt.*;
import java.applet.*;

public class stoplichtjava extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(150,45,70,150);
        g.drawRect(150,45,70,150);
        g.drawRect(173,180,20,150);
        g.fillRect(173,180,20,150);
        g.setColor(Color.red);
        g.fillOval(163,50,40,40);
        g.drawOval(163,50,40,40);
        g.setColor(Color.yellow);
        g.fillOval(163,100,40,40);
        g.drawOval(163,100,40,40);
        g.setColor(Color.green);
        g.fillOval(163,150,40,40);
        g.drawOval(163,150,40,40);
    }
}
