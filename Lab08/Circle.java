import javax.management.monitor.GaugeMonitor;

public class Circle extends Geometric implements Comparable {
    private double radius;

    //Constructure
    public Circle(double radius) {
        this.radius = radius;
    }
    
    //Methods
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getParameter() {
        return Math.PI * 2 * this.radius;
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

    public double getRadius() {
        return this.radius;
    }
}