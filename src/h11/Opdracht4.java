package h11;

import java.awt.*;
import java.applet.*;

/**
 * Created by Gebruiker on 26-10-2016.
 * Af
 */
public class Opdracht4 extends Applet{

    public void init() {}

    public void paint(Graphics g) {
        int teller = 1;
        int getal = 1;
        int y = 0;

        while(teller < 30) {
            y += 20;
            teller = getal * 3;
            g.drawString("" + teller, y, 50 );
            getal++;
        }
    }

}
