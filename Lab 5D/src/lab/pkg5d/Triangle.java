
package lab.pkg5d;

public class Triangle extends Shape {
    private double height = 0;
    private double base = 0;
    private double area = 0;
    private int x = 0;
    private int y = 0;
    private int z = 0;
    
    public Triangle(int x, int y, int z, double base, double height) {
        super(x,y,z);
        this.height = height;
        this.base = base;
        this.area = Area();
        this.x = x;
        this.y = y;
        this.z = z;
        Point center = new Point(this.x, this.y, this.z); 
    }
    public void setHeight(float newHeight) {
        this.height = newHeight;
    }
    public void setWidth(float newWidth) {
        this.base = newWidth;
    }
    public double getHeight() {
        return this.height;
    }
    public double getBase() {
        return this.base;
    }
    @Override
    public double Area() {
        this.area = (float)(.5 * this.height * this.base); 
        return this.area;
    }
    @Override
    public String toString() {
        String result =""
                + "(" + this.getX() + "," + this.getY() + "," + this.getZ() + ")" + "=" + "/" + this.area + "\\"; 
        return result;
                
    }
    
}
