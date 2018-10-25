
package lab.pkg5d;

public class Rectangle extends Shape {     
    private double height = 0;
    private double width = 0;
    private double area = 0;
    private int x = 0;
    private int y = 0;
    private int z = 0;
    
    public Rectangle(int x, int y, int z, double width, double height) {
        super(x,y,z);
        this.height = height;
        this.width = width;
        this.area = Area();
        this.x = x;
        this.y = y;
        Point center = new Point(this.x, this.y, this.z);
    }
    
    
    
    public void setLength(float newLength) {
        this.height = newLength;
    }
    public void setWidth(float newWidth) {
        this.width = newWidth;
    }
    public double getLength() {
        return  this.height;
    }
    public double getWidth() {
        return  this.width;
    }
    @Override
    public double Area() {
        return (this.height * this.width);
    }
    @Override
    public String toString() {
        String result ="(" + this.getX() + "," + this.getY() + "," + this.getZ() + ")" + "=" + "[" + this.area + "]";
        return result;
    }
   
    
    // parsing error.....really????
}
    
    

