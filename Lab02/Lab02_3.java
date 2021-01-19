import java.util.Scanner;

public class Lab02_3{
    public static void main(String[] args){
        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter yeaer: (e.g. 2012): ");
        int year = in.nextInt();
        System.out.println("Enter month: 1-12: ");
        int month = in.nextInt();
        if(month == 1)
        {
            year--;
            month = 13;
        }
        else if(month == 2)
        {
            year--;
            month = 14;
        }
        System.out.println("Enter the day of the month: 1-31: ");
        int day = in.nextInt();
        int h = (day + ( 26*(month+1)/10) + (year % 100) + (year % 100) / 4 + (year / 100) / 4 + 5*(year / 100)) % 7;
        System.out.println("Day of the week is " + days[h]);
    }
}
