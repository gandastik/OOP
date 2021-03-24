public class ComparableCircle extends Circle implements Comparable {


    public int compareTo(Circle c){
        if(c.getArea() == super.getArea()){
            return 0;
        }
        else if(c.getArea() < super.getArea()) {
            return 1;
        }
        else return -1;
    }
}