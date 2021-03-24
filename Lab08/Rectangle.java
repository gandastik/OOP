public class Rectangle extends Geometric implements Comparable, Cloneable{
    private double width;
    private double height;

    //Constructure
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Methods
    public double getArea() {
        return this.width * this.height;
    }

    public double getParameter() {
        return this.width * 2.0 + this.height * 2.0;
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
        return "Rectangle{width: "  + this.width + ", height: " + this.height + ", color: " + super.color + ", isFilled: " + super.isFilled + ", area: " + this.getArea() + ", parameter: " + this.getParameter() + " }";
    }
}