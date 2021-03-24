public class Rectangle extends Geometric implements Comparable, Cloneable{
    private double width;
    private double height;
    private String name;

    //Constructure
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width, double height, String color, double weight) {
        this.width = width;
        this.height = height;
        super.color = color;
        super.weight = weight;
    }

    //Methods
    public double getArea() {
        return this.width * this.height;
    }

    public double getParameter() {
        return this.width * 2.0 + this.height * 2.0;
    }

    @Override
    public int compareTo(Object rect) {
        // TODO Auto-generated method stub
        if(((Rectangle)rect).getArea() == this.getArea()){
            return 0;
        }
        else if( this.getArea() > ((Rectangle)rect).getArea() ){
            return 1;
        }
        else return -1;
    }

    public boolean equals(Rectangle r) {
        if(r.getArea() == this.getArea()){
            return true;
        }
        return false;
    } 

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
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
        return "Rectangle{width: "  + this.width + ", height: " + this.height + ", color: " + super.color + ", isFilled: " + super.isFilled + ", area: " + this.getArea() + ", parameter: " + this.getParameter() + " }";
    }

    public double getWeight() {
        return super.weight;
    }

    public String getName() {
        return this.name;
    }
}