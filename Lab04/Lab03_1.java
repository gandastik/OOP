// find the first 100 numbers of prime number that are palindrome.
public class Lab03_1 {
    public static void main(String[] args){
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