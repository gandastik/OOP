// Merge the two sorted list together.
import java.util.Scanner;
public class Lab03_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list1 = new int[n]; 
        for(int i=0;i<n;i++)
        {
            list1[i] = in.nextInt();
        }
        int x = in.nextInt();
        int[] list2 = new int[x];
        for(int i=0;i<x;i++)
        {
            list2[i] = in.nextInt();
        }
        int[] ans = new int[list1.length + list2.length];
        ans = merge(list1, list2);
        for(int i=0;i<list1.length+list2.length;i++)
        {
            System.out.printf("%d ", ans[i]);
        }
    }
    public static int[] merge(int[] list1, int[] list2){
        int[] ret = new int[list1.length + list2.length];
        int count = 0;
        int l = 0;
        int r = 0;
        while(l <= list1.length-1 && r <= list2.length-1){
            if(list1[l] <= list2[r])
            {
                ret[count] = list1[l];
                l++;
            }
            else
            {
                ret[count] = list2[r];
                r++;
            }
            count++;
        }
        while(l <= list1.length - 1)
        {
            ret[count] = list1[l];
            l++;
            count++;
        }
        while(r <= list2.length - 1)
        {
            ret[count] = list2[r];
            r++;
            count++;
        }
        return ret;
    }
}
