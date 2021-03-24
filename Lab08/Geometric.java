import javax.swing.AbstractCellEditor;

public abstract class Geometric implements Comparable{
    protected boolean isFilled;
    protected String color;
    protected double weight;
    protected double area;
    protected double parameter;

    public abstract double getArea();
    public abstract double getParameter(); 
    public abstract String getName();
    
    public static String max(Geometric a, Geometric b){
        if(a.getArea() > b.getArea()){
            return a.getName();
        }
        else if(b.getArea() > a.getArea()){
            return b.getName();
        }
        return "EQUAL";
    }
}