
package lab.pkg5d;


public class Circle extends Shape {
    
     private double radius = 0;
    
    
    public Circle(int x, int y, int z, double radius) {
        super(x,y,z);
        this.radius = radius;
          
    }

    public double getRadius() {
        return radius;
    }
     
    @Override
    public double Area() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public String toString() {
        String result ="(" + this.getX() + "," + this.getY() +  "," + this.getZ() + ")" +  "=" + "(" + this.Area() + ")";
        return result;
}
    
    
    
    
}
    

