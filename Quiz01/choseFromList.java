import java.util.Scanner;

public class choseFromList{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner in = new Scanner(System.in);
        int[] target = new int[5];
        int[] ret = new int[4];
        int index = 0;
        System.out.print("Select 5 numbers from the list: ");
        for(int i=0;i<5;i++){
            target[i] = in.nextInt();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<9;j++){
                if(arr[j] == target[i]){
                    arr[j] = 0;
                }
            }
        }
        for(int i=0;i<9;i++){
            if(arr[i] != 0 ){
                ret[index] = arr[i];
                index++;
            }
        }
        System.out.print("Number not in the list are: ");
        for(int i=0;i<4;i++){
            System.out.print(ret[i] + " ");
        }
    }
}