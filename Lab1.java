/**
 * Lab1.java:
 * This is my abstract art for lab 1
 *
 * @author Joseph Chang
 */

import wheelsunh.users.*;
import wheelsunh.users.Frame;
import java.awt.Color;

public class Lab1
{
    /**
     * Function main begins with program execution
     *
     * @param args Variables from command line invocation
     */
    public static void main(String[] args)
    {
        Frame frame = new Frame();

        //All TOGETHER
        Ellipse ellipse = new Ellipse();
        ellipse.setColor(Color.CYAN);
        ellipse.setSize(100, 200);
        ellipse.setLocation(100, 200);

        //ON YOUR OWN
        Rectangle rec = new Rectangle();
        rec.setColor(Color.GRAY);
        rec.setSize(250,100);
        rec.setLocation(300, 200);

        Rectangle rec1 = new Rectangle();
        rec1.setColor(Color.GRAY);
        rec1.setSize(125,100);
        rec1.setLocation(360, 150);

        Ellipse weel1 = new Ellipse();
        weel1.setColor(Color.black);
        weel1.setSize(75,75);
        weel1.setLocation(320, 260);

        Ellipse weel2 = new Ellipse();
        weel2.setColor(Color.black);
        weel2.setSize(75,75);
        weel2.setLocation(450, 260);

        Rectangle wind1 = new Rectangle();
        wind1.setColor(Color.cyan);
        wind1.setSize(45, 35);
        wind1.setLocation(370, 160);

        Rectangle wind2 = new Rectangle();
        wind2.setColor(Color.cyan);
        wind2.setSize(50, 35);
        wind2.setLocation(425, 160);

        Rectangle bar0 = new Rectangle();
        bar0.setColor(Color.DARK_GRAY);
        bar0.setSize(3, 75);
        bar0.setLocation(357,260);

        Rectangle bar1 = new Rectangle();
        bar1.setColor(Color.DARK_GRAY);
        bar1.setSize(3, 75);
        bar1.setLocation(357,260);
        bar1.setRotation(45);

        Rectangle bar2 = new Rectangle();
        bar2.setColor(Color.DARK_GRAY);
        bar2.setSize(3, 75);
        bar2.setLocation(357,260);
        bar2.setRotation(90);

        Rectangle bar3 = new Rectangle();
        bar3.setColor(Color.DARK_GRAY);
        bar3.setSize(3, 75);
        bar3.setLocation(357,260);
        bar3.setRotation(135);

        Rectangle bar20 = new Rectangle();
        bar20.setColor(Color.DARK_GRAY);
        bar20.setSize(3, 75);
        bar20.setLocation(487,260);

        Rectangle bar21 = new Rectangle();
        bar21.setColor(Color.DARK_GRAY);
        bar21.setSize(3, 75);
        bar21.setLocation(487,260);
        bar21.setRotation(45);

        Rectangle bar22 = new Rectangle();
        bar22.setColor(Color.DARK_GRAY);
        bar22.setSize(3, 75);
        bar22.setLocation(487,260);
        bar22.setRotation(90);

        Rectangle bar23 = new Rectangle();
        bar23.setColor(Color.DARK_GRAY);
        bar23.setSize(3, 75);
        bar23.setLocation(487,260);
        bar23.setRotation(135);
    }
}
