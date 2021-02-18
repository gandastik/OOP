import java.util.Scanner;
public class Lab06_1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.print("Please enter your age: ");
        int age = in.nextInt();
        System.out.print("Please enter your weight in pounds: ");
        double weight = in.nextDouble();
        System.out.print("Please enter your height in feet: ");
        double feet = in.nextDouble();
        System.out.print("Please enter your height in inches: ");
        double inches = in.nextDouble();
        BMI bmi = new BMI(name, age, weight, feet, inches);
        System.out.println("Calculating the BMI");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println("Caculating completed");
        System.out.println("The BMI of " + bmi.getName() + " at the age of " + bmi.getAge() + " with the height of " + bmi.getFeet() + " feet "
        + bmi.getInches() + " inches and the weight of " + bmi.getWeight() + " Pounds");
        System.out.println("with the BMI of " + bmi.getBMI() + " And the Interpretation is " + bmi.getInterpretation());
    }
}