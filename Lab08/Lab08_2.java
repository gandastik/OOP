public class Lab08_2 { 
    public static void main(String[] args){ 
        Rectangle rect1 = new Rectangle(10, 20);
        Rectangle rect2 = new Rectangle(20, 30);

        Circle cir1 = new Circle(38);
        Circle cir2 = new Circle(58);

        Triangle tri1 = new Triangle(15, 20, 25);

        Geometric[] a = {rect1, rect2, cir1, cir2, tri1};
        
        System.out.println("Sum of the area is : " + sumArea(a) + " sqr u.");
    }

    public static double sumArea(Geometric[] a){
        double total = 0;
        for(Geometric object: a) {
            // total += object.getArea();
            if(object instanceof Circle){
                System.out.println("THIS AREA OF CIRCLE IS : " + ((Circle)object).getArea());
                total += ((Circle)object).getArea();
            }
            else if( object instanceof Rectangle){
                System.out.println("THIS AREA OF RECTANGLE IS : " + ((Rectangle)object).getArea());
                total += ((Rectangle)object).getArea();
            }
            else {
                System.out.println("THIS AREA OF TRIANGLE IS : " + ((Triangle)object).getArea());
                total += ((Triangle)object).getArea();
            }
        }
        return total;
    }
}