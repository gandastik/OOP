import java.util.Scanner;
public class Lab05_2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        RegularPolygon regularPolygon;
        while(true){
            System.out.println("-------Menu--------");
            System.out.println("1. create a RegularPolygon with no arguments");
            System.out.println("2. create a RegularPolygon with number of sides and the length of sides as arguments");
            System.out.println("3. create a RegularPolygon with number of sides, the length of sides, x-coordinate and y-coordinate as arguments");
            System.out.println("4. exit");
            System.out.println("-------------------");
            int n = in.nextInt();
            int numSide;
            double side;
            if(n == 1){
                regularPolygon = new RegularPolygon();
                System.out.println("The area of the RegularPolygon is " + regularPolygon.getArea());
                System.out.println("The perimeter of the RegularPolygon is " + regularPolygon.getPerimeter());
            }
            else if(n == 2){
                while(true){
                    System.out.print("Please enter the number of sides : ");
                    numSide = in.nextInt();
                    if(numSide <= 0){
                        System.out.println("invalid nubmer of sides");
                    }
                    else {
                        break;
                    }
                }
                while(true){
                    System.out.print("Please enter the length of each side : ");
                    side = in.nextDouble();
                    if(side <= 0){
                        System.out.println("Invalid length of each side");
                    }
                    else{
                        break;
                    }
                }
                regularPolygon = new RegularPolygon(numSide, side);
                System.out.println("The area of the RegularPolygon is " + regularPolygon.getArea());
                System.out.println("The perimeter of the RegularPolygon is " + regularPolygon.getPerimeter());
            }
            else if(n == 3){
                while(true){
                    System.out.print("Please enter the number of sides : ");
                    numSide = in.nextInt();
                    if(numSide <= 0){
                        System.out.println("invalid nubmer of sides");
                    }
                    else {
                        break;
                    }
                }
                while(true){
                    System.out.print("Please enter the length of each side : ");
                    side = in.nextDouble();
                    if(side <= 0){
                        System.out.println("Invalid length of each side");
                    }
                    else{
                        break;
                    }
                }
                System.out.print("Please enter the x coordinate : ");
                double x = in.nextDouble();
                System.out.print("Please enter the y coordinate : ");
                double y = in.nextDouble();
                regularPolygon = new RegularPolygon(numSide, side, x, y);
                System.out.println("The area of the RegularPolygon is " + regularPolygon.getArea());
                System.out.println("The perimeter of the RegularPolygon is " + regularPolygon.getPerimeter());
            }
            else if( n == 4){
                break;
            }
        }
    }
}