import java.util.Scanner;

public class Lab02_1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter today's day: ");
        int day = in.nextInt();
        System.out.println("Enter the number of days elapsed since today: " );
        int buf = in.nextInt();
        int newDay = (day + buf) % 7;
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
                         "Thursday", "Friday", "Saturday"};
        System.out.println("Today is " + days[day] + " and the future day is " + days[newDay]);
    }
}
