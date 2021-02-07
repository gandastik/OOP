import java.util.Random;

public class Lab04_3{
    public static void main(String[] args){
        int[] arr = new int[1000];
        StopWatch stopWatch = new StopWatch();
        System.out.println("Creating a 1000-elements list");
        for(int i=0;i<1000;i++)
        {
            arr[i] = (int)(Math.random()*1000);
            System.out.printf("%d ", arr[i]);
            if(i % 10 == 0 && i != 0)
            {
                System.out.println("");
            }
        }
        System.out.println("\nList created.");
        System.out.println("Sorting stopwatch starts...");
        stopWatch.start();
        selection_sort(arr);
        stopWatch.stop();
        for(int i=0;i<1000;i++)
        {
            System.out.printf("%d ", arr[i]);
            if(i % 10 == 0 && i != 0)
            {
                System.out.println("");
            }
        }
        System.out.println("\nSorting stopwatch stoped.");
        System.out.println("The sort time is " + stopWatch.getElapsedTime() + " milliseconds.");
        System.out.println("Creating 1000 PalindromePrime....");
        PalindromePrime palindromePrime = new PalindromePrime();
        stopWatch.start();
        palindromePrime.run();
        stopWatch.stop();
        System.out.println("\nPalindromePrime created.");
        System.out.println("The palindromeprime stopwatch stoped");
        System.out.println("The palindromePrime time is " + stopWatch.getElapsedTime() + " milliseconds.");
    }
    public static void selection_sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    }
}
class PalindromePrime {
    public void run(){
        int[] arr = new int[100];
        int index = 0;
        int num = 2;
        while(index < 100)
        {
            if(isPrime(num))
            {
                if(isPalindrome(num))
                {
                    arr[index] = num;
                    index++;
                }
            }
            num++;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.printf("%d ", arr[i]);
            if(i % 10 == 0 && i != 0) System.out.printf("\n");
        }
    }
    public static boolean isPrime(int n){
        if(n < 2) return true;
        //Brute force (bad!) the other method would be the sieve of eratosthenes. time complexity O(n * logn * logn)
        for(int i=2;i<n;i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int n) {
        //Palindrome of number ex. 1234 != 4321 but 2002 == 2002
        int reversed = 0;
        int temp = n;
        //reversed the n
        while(temp > 0)
        {
            int r = temp % 10;
            reversed = reversed * 10 + r;
            temp = temp / 10;
        }
        if(reversed == n) return true;
        return false;
    }
}
