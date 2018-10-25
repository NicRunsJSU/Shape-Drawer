
package lab.pkg5d;

public class Point { 
    
    private int x = 0;
    private int y = 0;
    private int z = 0;
   
    public Point(int newX, int newY, int newZ) {
        
        // Check X
        
        if (newX <= 500 && newX >= 0 ) {
            this.x = newX;
        }
        else if ( newX < 0) {
            this.x = 0;
        }
        else if ( newX > 500) { 
            this.x = 500;
        }
        
        // Check Y
        
        if (newY <= 500 && newY >= 0 ) {
            this.y = newY;
        }
        else if (newY > 500 ) {
            this.y = 500;
        }
        else if (newY < 0 ) {
            this.y = 0;
        }
        
        // Check Z
        
        if (newZ <= 500 && newZ >= 0) {
            this.z = newZ;
        }
        else if (newZ > 500) {
            this.z = 500;
        }
        else if (newZ < 0) {
            this.z = 0;
        }
            
}
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getZ() {
        return z;
    }
    

    
}

    

