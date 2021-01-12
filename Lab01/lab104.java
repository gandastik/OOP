import java.util.Scanner;

public class lab104
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int firstDigit = num / 100;
        int secondDigit = (num / 10) % 10;
        int thirdDigit = num % 10;
        System.out.println("first: " + firstDigit + " second: " + secondDigit + " third: " + thirdDigit);
        int sum = firstDigit + secondDigit + thirdDigit;
        System.out.println("the sum of the digits is " + sum);
    }
}
