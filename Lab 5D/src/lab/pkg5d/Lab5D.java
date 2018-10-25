package lab.pkg5d;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Lab5D extends JPanel {
    
    private final int MAX_LAYER = 10;
    
    private ArrayList<Shape> shapes;
    
    /* CONSTRUCTOR */
    
    public Lab5D() {
        
        super();
        
        this.setBackground(Color.decode("#00BFFF")); // Deep Sky Blue

        shapes = new ArrayList<>();
        
        /* Create Shapes */
        
        /*shapes.add(new Rectangle(100, 100, 0, 100, 100));
        shapes.add(new Circle(400, 100, 1, 50));
        shapes.add(new Triangle(250, 350, 2, 100, 100));*/
        
        // LOOP FOR 30 RANDOM SHAPES
        
        for (int i = 0; i < 30; ++i) {
            
            // Random Shape Generator
            
            
            int whatShape = (int)(Math.random() * 3);
            
            // Rectangle
            
            if (whatShape == 0) {
                int rX = (int)(Math.random() * 500);
                int rY = (int)(Math.random() * 500);
                int rZ = 1;
                int rL = (int)(Math.random() * 100);
                int rW = (int)(Math.random() * 100);
                
                shapes.add(new Rectangle(rX, rY, rZ, rL, rW));
            }            
             // Circle
             
             if (whatShape  == 1) {
                 int cX = (int)(Math.random() * 500);
                 int cY = (int)(Math.random() * 500);
                 int cZ = 1;
                 int cR = (int)(Math.random() * 100);
                 
                 shapes.add(new Circle(cX, cY, cZ, cR));
             }
             // Triangle
             
             if (whatShape == 2) {
                 int tX = (int)(Math.random() * 500);
                 int tY = (int)(Math.random() * 500);
                 int tZ = 1;
                 int tB = (int)(Math.random() * 100);
                 int tH = (int)(Math.random() * 100);
                 
                 shapes.add(new Triangle( tX, tY, tZ, tB, tH));
             }
             // Seeing what shapes should be printed
             System.out.print(whatShape + ",");
        }
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        /* Iterate through Layers 1 through 10 */
        
        for (int i = 0; i < MAX_LAYER; ++i) {

            /* Iterate through Shape collection */
        
            for (Shape s : shapes) {

                /* Get X and Y coordinates */
                
                int x = s.getX();
                int y = s.getY();

                /* Check Layer */
                
                if (s.getZ() == i) {

                    /* RECTANGLE */

                    if (s instanceof Rectangle) {

                        g.setColor(Color.decode("#B22222")); // Firebrick Red
                        
                        Rectangle r = (Rectangle)s;
                        int x2 = (int)(x - r.getWidth() / 2);
                        int y2 = (int)(y - r.getLength() / 2);
                       // System.out.println("X: " + x + ", Y: " + y + ", X2: " + x2 + ", Y2: " + y2 + "\n");
                        g.fillRect(x2, y2 , (int) r.getWidth(), (int) r.getLength());
                       

                    }

                    /* CIRCLE */

                    else if (s instanceof Circle) {

                        g.setColor(Color.YELLOW); // Yellow

                        Circle c = (Circle)s;
                        int rx = (int)(x - c.getRadius());
                        int ry = (int) (y - c.getRadius());
                        g.fillOval(rx, ry, (int)(c.getRadius() * 2), (int)(c.getRadius() * 2));
                              
                                

                    }

                    /* TRIANGLE */

                    else if (s instanceof Triangle) {

                        g.setColor(Color.decode("#228B22")); // Forest Green
                        
                       Triangle t = (Triangle)s;
                       
                       int numberOfSides = 3;
                       
                       int[] xPoints = new int[3];
                       xPoints[0] = (int)(x - t.getBase()/2);
                       xPoints[1] = (int)(x);
                       xPoints[2] = (int)(x + t.getBase()/2);
                       
                        int[] yPoints = new int[3]; 
                       yPoints[0] = (int)(y + t.getHeight()/2);
                       yPoints[1] = (int)(y - t.getHeight()/2);
                       yPoints[2]= (int)(y + t.getHeight()/2);
                       
                       
                       g.fillPolygon(xPoints, yPoints , numberOfSides);
                       
                    }
                    
                    /* Tag shape with area */

                    g.setColor(Color.ORANGE);
                    g.drawString(Integer.toString((int)s.Area()), x, y);
                    
                } // end layer if

            } // end shapes loop
            
        } // end layer loop
        
    } // end paintComponent()

}