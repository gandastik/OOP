import java.math.*;
public class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;
    
    RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }
    RegularPolygon(int new_n, double new_side){
        this.n = new_n;
        this.side = new_side;
        this.x = 0;
        this.y = 0;
    }
    RegularPolygon(int new_n, double new_side, double new_x, double new_y){
        this.n = new_n;
        this.side = new_side;
        this.x = new_x;
        this.y = new_y;
    }

    //Accessors
    public int getN(){
        return this.n;
    }
    public double getSide(){
        return this.side;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getPerimeter(){
        return this.side * this.n;
    }
    public double getArea(){
        return (this.n * Math.pow(this.side, 2)) / (4 * Math.tan(Math.PI / this.n));
    }

    //Mutators
    public void setN(int new_n){
        this.n = new_n;
    }
    public void setSide(double new_side){
        this.side = new_side;
    }
    public void setX(double new_x){
        this.x = new_x;
    }
    public void setY(double new_y){
        this.y = new_y;
    }

}
