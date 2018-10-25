
package lab.pkg5d;

public abstract class Shape {
    private Point center;
   
    public Shape(int x, int y, int z) {
      
        this.center = new Point( x, y, z);
    }

    public int getX() {
        return center.getX();
    }

    public int getY() {
        return center.getY();
    }

    public int getZ() {
        return center.getZ();
    }
    public abstract double Area();
    
}
//get Radius 