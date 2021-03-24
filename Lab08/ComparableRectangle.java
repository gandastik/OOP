import java.awt.Rectangle;

public class ComparableRectangle extends Rectangle implements Comparable{


    public int compareTo(Rectangle rect){
        if(rect.getArea() == super.getArea()){
            return 0;
        }
        else if( super.getArea() > rect.getArea() ){
            return 1;
        }
        else return -1;
    }
}