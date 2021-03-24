import java.lang.Cloneable;

public class Circle extends Geometric implements Comparable, Cloneable {
    private double radius;
    private String name;

    //Constructure
    public Circle(){
        this.radius = 10.f;
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {
        this.radius = radius;
        super.color = color;
        super.weight = weight;
    }
    
    //Methods
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getParameter() {
        return Math.PI * 2 * this.radius;

    }
    @Override
    public int compareTo(Object c) {
        if(((Circle)c).getArea() == this.getArea()){
            return 0;
        }
        else if(this.getArea() > ((Circle)c).getArea() ) {
            return 1;
        }
        else return -1;

    }
    
    public boolean equals(Circle c){
        if(c.getRadius() == this.radius){
            return true;
        }
        return false;
    }

    @Override
    protected Object clone()
        throws CloneNotSupportedException
    {
        return (Circle)super.clone();
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

    public double getRadius() {
        return this.radius;
    }

    public double getWeight() {
        return super.weight;
    }

    public String getName() {
        return this.name;
    }
}