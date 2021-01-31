import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Lab03_3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = (int)(Math.random() * 2);
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.printf("%d", arr[i][j]);
            }
            System.out.println("");
        }
        check_rows(arr);
        check_cols(arr);
        check_superdiagonal(arr);
        check_diagonal(arr);
        check_subdiagonal(arr);
    }

    public static void check_rows(int[][] arr) {
        //check for zeros
        Boolean[] isZero = new Boolean[arr[0].length];
        Arrays.fill(isZero, Boolean.TRUE);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j] != 0)
                {
                    isZero[i] = false;
                    break;
                }
            }
        }
        //check for ones
        Boolean[] isOne = new Boolean[arr[0].length];
        Arrays.fill(isOne, Boolean.TRUE);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j] != 1)
                {
                    isOne[i] = false;
                    break;
                }
            }
        }
        boolean checkForZero = false;
        boolean checkForOne = false;
        for(int i=0;i<isZero.length;i++)
        {
            if(isZero[i] == true)
            {
                checkForZero = true;
                break;
            }
        }
        for(int i=0;i<isOne.length;i++)
        {
            if(isOne[i] == true)
            {
                checkForOne = true;
                break;
            }
        }
        if(checkForZero)
        {
            System.out.printf("All 0s in row ");
            for(int i=0;i<isZero.length;i++)
            {
                if(isZero[i])
                {
                    System.out.printf("%d ", i);
                }
            }
            System.out.println("");
        }
        if(checkForOne)
        {
            System.out.printf("All 1s in row ");
            for(int i=0;i<isOne.length;i++)
            {
                if(isOne[i])
                {
                    System.out.printf("%d ", i);
                }
            }
            System.out.println("");
        }
        if(checkForOne == false && checkForZero == false) System.out.println("No same number on a row");
    }
    public static void check_cols(int[][] arr) {
        //check for zeros
        Boolean[] isZero = new Boolean[arr[0].length];
        Arrays.fill(isZero, Boolean.TRUE);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j][i] != 0)
                {
                    isZero[i] = false;
                    break;
                }
            }
        }
        //check for ones
        Boolean[] isOne = new Boolean[arr[0].length];
        Arrays.fill(isOne, Boolean.TRUE);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j][i] != 1)
                {
                    isOne[i] = false;
                    break;
                }
            }
        }
        boolean checkForZero = false;
        boolean checkForOne = false;
        for(int i=0;i<isZero.length;i++)
        {
            if(isZero[i] == true)
            {
                checkForZero = true;
                break;
            }
        }
        for(int i=0;i<isOne.length;i++)
        {
            if(isOne[i] == true)
            {
                checkForOne = true;
                break;
            }
        }
        if(checkForZero)
        {
            System.out.printf("All 0s in column ");
            for(int i=0;i<isZero.length;i++)
            {
                if(isZero[i])
                {
                    System.out.printf("%d ", i);
                }
            }
            System.out.println("");
        }
        if(checkForOne)
        {
            System.out.printf("All 1s in column ");
            for(int i=0;i<isOne.length;i++)
            {
                if(isOne[i])
                {
                    System.out.printf("%d ", i);
                }
            }
            System.out.println("");
        }
        if(checkForOne == false && checkForZero == false) System.out.println("No same number on a column");
    }
    public static void check_diagonal(int[][] arr)
    {
        //check for zeros
        boolean isZero = true;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i == j)
                {
                    if(arr[i][j] == 1)
                    {
                        isZero = false;
                    }
                }
            }
        }
        //check for ones
        boolean isOne = true;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if( i == j)
                {
                    if(arr[i][j] == 0)
                    {
                        isOne = false;
                    }
                }
            }
        }
        if(isOne)
        {
            System.out.println("All 1s on the diagonal");
        }
        if(isZero)
        {
            System.out.println("All 0s on the diagnoal");
        }
        if(!isZero && !isOne)
        {
            System.out.println("No same numbers on the diagonal");
        }
    }
    public static void check_superdiagonal(int[][] arr)
    {
        //check for zeros
        boolean isZero = true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++)
            {
                if( j - i == 1)
                {
                    if(arr[i][j] == 1)
                    {
                        isZero = false;
                    }
                }
            }
        }
        //check for ones
        boolean isOne = true;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if( j - i == 1)
                {
                    if(arr[i][j] == 0)
                    {
                        isOne = false;
                    }
                }
            }
        }
        if(isOne)
        {
            System.out.println("All 1s on the superdiagonal");
        }
        if(isZero)
        {
            System.out.println("All 0s on the superdiagonal");
        }
        if(!isOne && !isZero)
        {
            System.out.println("No same numbers on the superdiagonal");
        }
    }
    public static void check_subdiagonal(int[][] arr)
    {
        //check for zeros
        boolean isZero = true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++)
            {
                if( i - j == 1)
                {
                    if(arr[i][j] == 1)
                    {
                        isZero = false;
                    }
                }
            }
        }
        //check for ones
        boolean isOne = true;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if( i - j == 1)
                {
                    if(arr[i][j] == 0)
                    {
                        isOne = false;
                    }
                }
            }
        }
        if(isOne)
        {
            System.out.println("All 1s on the subdiagonal");
        }
        if(isZero)
        {
            System.out.println("All 0s on the subdiagonal");
        }
        if(!isOne && !isZero)
        {
            System.out.println("No same numbers on the subdiagonal");
        }
    }
}