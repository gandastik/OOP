import java.lang.Math;
public class Triangle extends Geometric { 
    private double side1;
    private double side2;
    private double side3;
    private double s;
    
    //Constructure
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.s = (this.side1 +this.side2 +this.side3) / 2.0;
    }

    //Methods
    public double getArea() {
        super.area = Math.sqrt((this.s * (this.s - this.side1) * (this.s - this.side2) * (this.s - this.side3)));
        return Math.sqrt((this.s * (this.s - this.side1) * (this.s - this.side2) * (this.s - this.side3)));
    }

    public double getParameter() {
        // super.parameter = this.side1 + this.side2 + this.side3;
        return this.side1 + this.side2 + this.side3;
    }

    //Setters
    public void setIsFilled(boolean bool){
        super.isFilled = bool;
    }

    public void setColor(String color) {
        super.color = color;
    }

    //Getters
    public boolean getIsFilled(){
        return super.isFilled;
    }
    
    public String getColor() {
        return super.color;
    }

    public String toString() {
        return "Triengle{side1: " + this.side1 + ", side2: " + this.side2 + ", side3: " + this.side3 + ", Color: " + super.color + ", isFilled: " + super.isFilled + ", Area: " + this.getArea() + ", Parameter: " + this.getParameter() + "}";
    }
}