import java.util.Scanner;

public class Lab02_5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                System.out.printf("  ");
            }
            for(int k=i+1;k>0;k--)
            {
                System.out.printf("%d ", k);
            }
            for(int t=2;t<2+i;t++)
            {
                System.out.printf("%d ", t);
            }
            System.out.println("");
        }
    }
}
