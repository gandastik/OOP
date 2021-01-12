import java.util.Scanner;

public class lab102
{
    public static void main(String[] args)
    {
        double a=0;
        double b=0;
        double c=0;
        double d=0;
        double e=0;
        double f=0;
        double x=0;
        double y=0;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        x = ( e*d - b*f ) / ( a*b - b*c );
        y = ( a*f - e*c ) / ( a*b - b*c );
        System.out.println("x = " + x + " y = " + y);
    }
}
