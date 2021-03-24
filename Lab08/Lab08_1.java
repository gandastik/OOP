import java.util.Scanner;

public class Lab08_1 { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Creating Triangle");
        System.out.print("Enter side 1 : ");        
        double s1 = in.nextDouble();
        System.out.print("Enter side 2 : ");        
        double s2 = in.nextDouble();
        System.out.print("Enter side 3 : ");        
        double s3 = in.nextDouble();
        System.out.print("Enter Color : ");
        String color = in.nextLine();
        color = in.nextLine();
        System.out.print("Is Filled? : ");        
        boolean bool = in.nextBoolean();
        Triangle tri = new Triangle(s1, s2, s3);
        tri.setColor(color);
        tri.setIsFilled(bool);
        System.out.println(tri.toString()); 
    }
}