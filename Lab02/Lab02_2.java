import java.util.Scanner;
import java.lang.Math;

public class Lab02_2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] lst = {"scissor", "rock", "paper"};
        System.out.println("scissor (0), rock (1), paper (2) : ");
        int playerIn = in.nextInt();
        int rand = 0 + (int)(Math.random()*3);
        boolean check = false;
        if(playerIn == 0 && rand == 2) check = true;
        else if(playerIn == 1 && rand == 0) check = true;
        else if(playerIn == 2 && rand == 1 ) check = true;
        else check = false;

        if(playerIn == rand)
            System.out.println("The computer is " + lst[rand] + ". You are " + lst[playerIn] + ". It is a draw");
        else if(check)
            System.out.println("The computer is " + lst[rand] + ". You are " + lst[playerIn] + ". You won");
        else 
            System.out.println("The computer is " + lst[rand] + ". You are " + lst[playerIn] + ". You lost");
    }
}

