import java.util.Scanner;

public class Lab02_4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String cities[] = new String[3];
        System.out.println("Enter the first city: ");
        cities[0] = in.nextLine();
        System.out.println("Enter the second city: ");
        cities[1] = in.nextLine();
        System.out.println("Enter the third city: ");
        cities[2] = in.nextLine();
        for(int i=0;i<3;i++)
        {
            for(int j=i+1;j<3;j++)
            {
                if(cities[i].compareTo(cities[j]) > 0)
                {
                    String temp = cities[i];
                    cities[i] = cities[j];
                    cities[j] = temp;
                }
            }
        }
        System.out.println("The three cities in alphabetical order are " + cities[0] + " " + cities[1] + " " + cities[2]);
    }
}
