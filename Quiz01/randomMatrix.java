import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
public class randomMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mat = new int[n][n]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = (int)(Math.random() * 2);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }

        checkForOnes(mat);
        checkColl(mat);
    }

    public static void checkForOnes(int[][] mat) {
        int[] rows = new int[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j] == 1){
                    rows[i] += 1;
                }
            }
            // System.out.print(rows[i] + " ");
        }
        System.out.println(" ");
        int[] temp_rows = Arrays.copyOf(rows, rows.length);
        for(int i=0;i<temp_rows.length;i++){
            for(int j=i+1;j<temp_rows.length;j++){
                if(temp_rows[i] > temp_rows[j]){
                    int temp = temp_rows[i];
                    temp_rows[i] = temp_rows[j];
                    temp_rows[j] = temp;
                }
            }
            // System.out.print(temp_rows[i] + " ");
        }
        // System.out.println("");
        boolean check = false;
        int min = 999999999;
        for(int i=0;i<rows.length-1;i++){
            if(temp_rows[i] != temp_rows[i+1] && temp_rows[i] < min) {
                min = temp_rows[i]; 
                // System.out.print(temp_rows[i] + " ");
                break;
            }
        }
        int count = 0;
        for(int i=0;i<rows.length;i++){
            if(rows[i] == min){
                count++;
            }
        }
        if(count == 1){
            check = true;
        }
        else if(count > 1){
            check = false;
        }
        System.out.print("Row with the least found \"1\" :");
        if(check) {
            System.out.print("YES, ");
            for(int i=0;i<rows.length;i++){
                // System.out.print(rows[i] + " ");
                if(rows[i] == min){
                    System.out.print(i+1 + " ");
                }
            }
            System.out.println("");
        }
        else {
            System.out.println("NO");
        }
    }

    public static void checkColl(int[][] mat){
        int[] col = new int[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[j][i] == 0){
                    col[i] += 1;
                }
            }
        }
        int[] temp_cols = Arrays.copyOf(col, col.length);
        for(int i=0;i<temp_cols.length;i++){
            for(int j=i+1;j<temp_cols.length;j++){
                if(temp_cols[i] > temp_cols[j]){
                    int temp = temp_cols[i];
                    temp_cols[i] = temp_cols[j];
                    temp_cols[j] = temp;
                }
            }
            // System.out.print(temp_rows[i] + " ");
        }
        // System.out.println("");
        boolean check = false;
        int min = 999999999;
        for(int i=0;i<col.length-1;i++){
            if(temp_cols[i] != temp_cols[i+1] && temp_cols[i] < min) {
                min = temp_cols[i]; 
                // System.out.print(temp_rows[i] + " ");
                break;
            }
        }
        int count = 0; 
        for(int i=0;i<col.length;i++){
            if(col[i] == min){
                count++;
            }
        }
        if(count == 1){
            check = true;
        }
        else if(count > 1){
            check = false;
        }
        
        System.out.print("Cols with the least found \"0\" :");
        if(check) {
            System.out.print("YES, ");
            for(int i=0;i<col.length;i++){
                // System.out.print(rows[i] + " ");
                if(col[i] == min){
                    System.out.print(i+1 + " ");
                }
            }
            System.out.println("");
        }
        else {
            System.out.println("NO");
        }
    }
}