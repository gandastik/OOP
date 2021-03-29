import java.util.ArrayList;
import java.util.Scanner;

public class Lab08_3 {
    public static void main (String[] args) throws CloneNotSupportedException {
        ArrayList<Geometric> arr = new ArrayList<Geometric>();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Menu (1=Circle, 2=Rectangle, 3=Triangle, 4=Exit): ");
            int menu = in.nextInt();
            if(menu == 1){ 
                //Creating C1 and C2
                System.out.print("Circle c1 (radius color weight): ");
                Circle c1 = new Circle(in.nextDouble(), in.next(), in.nextDouble());
                c1.setName("c1");
                arr.add(c1);
                System.out.print("Circle c2 (radius color weight): ");
                Circle c2 = new Circle(in.nextDouble(), in.next(), in.nextDouble());
                c2.setName("c2");
                arr.add(c2);
                //Find the object that has the max area
                System.out.print("3.1 Find the larger object using max method : ");
                System.out.println("Answer: " + Geometric.max(getObjectByName(arr, in.next()), getObjectByName(arr, in.next())));

                //Cloning cricle c3 by using other circle
                System.out.print("Cloning Circle c3 by using : ");
                String name = in.next();
                Circle c3 = ((Circle)(Circle)getObjectByName(arr, name)).clone();
                arr.add(c3);
                System.out.println(name +" == c3 is : " + ((Circle)getObjectByName(arr, name) == (Circle)c3));
                System.out.println(name + ".equals(c3) is: " + ((Circle)getObjectByName(arr, name)).equals(c3));
                c3.setName("c3");

                //Compare between two comparable objects
                System.out.print("3.2 Find the larger 2 instances of comparable objects: ");
                String input = in.nextLine();
                input = in.nextLine();
                String[] names = input.split(" ");
                if(((Circle)getObjectByName(arr, names[0])).compareTo(getObjectByName(arr, names[1])) == 1) {
                    System.out.println("Answer: " + getObjectByName(arr, names[0]).getName() );
                }
                else if(((Circle)getObjectByName(arr, names[0])).compareTo(getObjectByName(arr, names[1])) == -1) {
                    System.out.println("Answer: " + getObjectByName(arr, names[1]).getName() );
                }
                else {
                    System.out.println("EQUAL");
                }
                System.out.println();
                System.out.println("------------------------------");
                System.out.println();
            }
            else if(menu == 2){
                System.out.print("Rectangle r1 (width height color weight) : ");
                Rectangle r1 = new Rectangle(in.nextDouble(), in.nextDouble(), in.next(), in.nextDouble());
                r1.setName("r1");
                arr.add(r1);
                System.out.print("Rectangle r2 (width height color weight) : ");
                Rectangle r2 = new Rectangle(in.nextDouble(), in.nextDouble(), in.next(), in.nextDouble());
                r2.setName("r2");
                arr.add(r2);

                //Find the object that has the max area
                System.out.print("3.1 Find the larger object using max method : ");
                System.out.println("Answer: " + Geometric.max(getObjectByName(arr, in.next()), getObjectByName(arr, in.next())));

                //Cloning cricle c3 by using other circle
                System.out.print("Cloning Rectangle r3 by using : ");
                String name = in.next();
                Rectangle r3 = ((Rectangle)(Rectangle)getObjectByName(arr, name)).clone();
                arr.add(r3);
                System.out.println(name +" == r3 is : " + ((Rectangle)getObjectByName(arr, name) == (Rectangle)r3));
                System.out.println(name + ".equals(r3) is: " + ((Rectangle)getObjectByName(arr, name)).equals(r3));
                r3.setName("r3");

                //Compare between two comparable objects
                System.out.print("3.2 Find the larger 2 instances of comparable objects: ");
                String input = in.nextLine();
                input = in.nextLine();
                String[] names = input.split(" ");
                if(((Rectangle)getObjectByName(arr, names[0])).compareTo(getObjectByName(arr, names[1])) == 1) {
                    System.out.println("Answer: " + getObjectByName(arr, names[0]).getName() );
                }
                else if(((Rectangle)getObjectByName(arr, names[0])).compareTo(getObjectByName(arr, names[1])) == -1) {
                    System.out.println("Answer: " + getObjectByName(arr, names[1]).getName() );
                }
                else {
                    System.out.println("EQUAL");
                }
                System.out.println();
                System.out.println("------------------------------");
                System.out.println();
            }
            else if(menu == 3) {
                //Creating t1 and t2
                System.out.print("Triangle t1 (side1 side2 side3 color weight) : ");
                Triangle t1 = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.next(), in.nextDouble());
                t1.setName("t1");
                arr.add(t1);
                System.out.print("Triangle t2 (side1 side2 side3 color weight) : ");
                Triangle t2 = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.next(), in.nextDouble());
                t2.setName("t2");
                arr.add(t2);

                //3.1 Find the larger object using max method
                System.out.print("3.1 Find the larger object using max method : ");
                System.out.println("Answer: " + Geometric.max(getObjectByName(arr, in.next()), getObjectByName(arr, in.next())));
                
                //Cloning Triangle t3 by using other triangle
                System.out.print("Cloning Rectangle t3 by using : ");
                String name = in.next();
                Triangle t3 = ((Triangle)(Triangle)getObjectByName(arr, name)).clone();
                arr.add(t3);
                System.out.println(name +" == t3 is : " + ((Triangle)getObjectByName(arr, name) == (Triangle)t3));
                System.out.println(name + ".equals(t3) is: " + ((Triangle)getObjectByName(arr, name)).equals(t3));
                t3.setName("t3");

                //Compare between two comparable objects
                System.out.print("3.2 Find the larger 2 instances of comparable objects: ");
                String input = in.nextLine();
                input = in.nextLine();
                String[] names = input.split(" ");
                if(((Triangle)getObjectByName(arr, names[0])).compareTo(getObjectByName(arr, names[1])) == 1) {
                    System.out.println("Answer: " + getObjectByName(arr, names[0]).getName() );
                }
                else if(((Triangle)getObjectByName(arr, names[0])).compareTo(getObjectByName(arr, names[1])) == -1) {
                    System.out.println("Answer: " + getObjectByName(arr, names[1]).getName() );
                }
                else {
                    System.out.println("Answer: EQUAL");
                }
                System.out.println();
                System.out.println("------------------------------");
                System.out.println();
            }
            else if(menu == 4){
                System.out.println("End of program.");
                break;
            }
            else {
                System.out.println("Invalid inputs, Please try again!");
            }
        }
    }

    //functions that return object by using name as a parameter. It will run through all the array and check if the input String "name" equals to the object's name.
    public static Geometric getObjectByName(ArrayList<Geometric> arr, String name) {
        for(Geometric o: arr){
            if(o.getName().equals(name)){ 
                return o;
            }
        }
        return null;
    }
}