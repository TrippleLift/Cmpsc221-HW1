import wheelsunh.users.*;
import java.awt.Color;


/** 
 * P1Start.java.
 * Displays a pad for building yor personal digital Avatar.
 *
 * A Ocellaris fish inspired by "Finding Nemo"
 * This orange fish is constructed by body, tail, and fins, which includes 6 ellipses, and a eye built by three circles.
 * There are three lines on its tail. The thicker one is drawn by rectangle, and the thinner one is drawn by line.
 * The user can use variable fishX and fishY to change the location of the fish.
 *
 * @author Joseph Chang
 * 
 */

public class P1Start 
{
    /**
    * Constructor for class P1Start
    */
    public P1Start( )
    {
        //frame
        Rectangle pad = new Rectangle( 200, 200 );
        pad.setFillColor( Color.WHITE );
        pad.setFrameColor( Color.BLACK );
        pad.setSize( 105, 123 );
        //--------------------------------------------
        // Add your code here

        //Location of the fish, 0 is the middle of the frame
        int fishX = 0;
        int fishY = 0;
        
        //fish body
        Ellipse body = new Ellipse();
        body.setSize(70, 40);
        body.setLocation(230 + fishX, 250 + fishY);
        body.setColor(Color.orange);
        
        //fish tail
        Ellipse tail = new Ellipse();
        tail.setSize(20, 30);
        tail.setLocation(210 + fishX, 255 + fishY);
        tail.setColor(Color.orange);
        tail.setRotation(30);

        //tail lines
        Line line1 = new Line();
        line1.setSize(10, 1);
        line1.setLocation(215 + fishX, 262 + fishY);
        line1.setColor(Color.black);
        line1.setRotation(25);

        Rectangle line2 = new Rectangle();
        line2.setSize(13, 1);
        line2.setLocation(210 + fishX, 268 + fishY);
        line2.setColor(Color.black);
        line2.setRotation(13);

        Line line3 = new Line();
        line3.setSize(9, 1);
        line3.setLocation(208 + fishX, 275 + fishY);
        line3.setColor(Color.black);
        line3.setRotation(0);

        //fish upperFin
        Ellipse upperFin = new Ellipse();
        upperFin.setSize(18, 9);
        upperFin.setLocation(263 + fishX, 243 + fishY);
        upperFin.setColor(Color.orange);
        upperFin.setRotation(15);

        //fish upperFin2
        Ellipse upperFin2 = new Ellipse();
        upperFin2.setSize(14, 7);
        upperFin2.setLocation(245 + fishX, 246 + fishY);
        upperFin2.setColor(Color.orange);
        upperFin2.setRotation(-10);

        //fish lowwerFin
        Ellipse lowwerFin = new Ellipse();
        lowwerFin.setSize(18, 9);
        lowwerFin.setLocation(250 + fishX, 289 + fishY);
        lowwerFin.setColor(Color.orange);
        lowwerFin.setRotation(-10);

        //fish sideFin
        Ellipse sideFin = new Ellipse();
        sideFin.setSize(26, 13);
        sideFin.setLocation(250 + fishX, 270 + fishY);
        sideFin.setColor(Color.YELLOW);
        sideFin.setRotation(-10);

        //fish sclera
        Ellipse sclera = new Ellipse();
        sclera.setSize(15, 15);
        sclera.setLocation(280 + fishX, 260 + fishY);
        sclera.setColor(Color.white);

        //fish anatomy
        Ellipse anatomy = new Ellipse();
        anatomy.setSize(12, 12);
        anatomy.setLocation(284 + fishX, 263 + fishY);
        anatomy.setColor(Color.black);

        //fish pupil
        Ellipse pupil = new Ellipse();
        pupil.setSize(5, 5);
        pupil.setLocation(290 + fishX, 264 + fishY);
        pupil.setColor(Color.white);
    } 
    
    /** 
      * Function main begins with program execution
      *
      * @param args String
      */
    public static void main( String[] args )
    {
        Frame f = new Frame( );
        P1Start app = new P1Start( );
    }
}
