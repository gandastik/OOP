import java.lang.Math;
public class Triangle extends Geometric implements Cloneable, Comparable{ 
    private double side1;
    private double side2;
    private double side3;
    private double s;
    private String name;
    
    //Constructure
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.s = (this.side1 +this.side2 +this.side3) / 2.0;
    }

    public Triangle(double side1, double side2, double side3, String color, double weight) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.s = (this.side1 +this.side2 +this.side3) / 2.0;
        super.color = color;
        super.weight = weight;
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

    @Override
    protected Triangle clone() throws CloneNotSupportedException {
        return (Triangle)super.clone();
    }

    @Override
    public int compareTo(Object o) {
        if(this.getArea() == ((Triangle)o).getArea() ) {
            return 0;
        }
        else if(this.getArea() > ((Triangle)o).getArea()) {
            return 1;
        }
        else return -1;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.getArea() == ((Triangle)obj).getArea()) {
            return true;
        }
        return false;
    }

    //Setters
    public void setIsFilled(boolean bool){
        super.isFilled = bool;
    }

    public void setColor(String color) {
        super.color = color;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getName() {
        return this.name;
    }
}