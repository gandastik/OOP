import java.util.Scanner;

public class lab103
{
    public static void main(String[] args)
    {
        System.out.println("Enter weight in pounds: ");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();
        double BMI = (weight * 0.45359237) / (height * 0.0254) / (height * 0.0254);
        System.out.printf("BMI is %.4f\n", BMI);
    }
}
