package h12;

import java.awt.*;
import java.applet.*;

/**
 * Created by Gebruiker on 29-10-2016.
 */
public class Opdracht1 extends Applet{

    double salaris[], totaalsalaris, gemiddelde;


    public void init() {
        salaris = new double [10];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 50 * teller + 50;
            totaalsalaris += salaris[teller];
        }
    }

    public void paint(Graphics g) {
       gemiddelde = totaalsalaris / salaris.length;
       g.drawString("Gemiddelde = " + gemiddelde, 50, 30);

    }
}
