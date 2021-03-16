import java.util.Scanner;
public class Lab07_1{
    public static void main(String[] args){
        Checking checkAcc = new Checking();
        Scanner in = new Scanner(System.in);
        System.out.println("run: \nCheckings");
        System.out.print("Overdraft Limit: ");
        double overdraft = in.nextDouble();
        checkAcc.setOverdraftLimit(overdraft);
        System.out.println("Balance is: " + checkAcc.getBalance());
        System.out.print("Withdraw: ");
        double withDrawn = in.nextDouble();
        checkAcc.withDraw(withDrawn);
        System.out.println("Balance is " + checkAcc.getBalance());
        System.out.println("This account was created at " + checkAcc.getDateCreated());

        Saving savingAcc = new Saving();
        System.out.println("run: \nSavings");
        System.out.println("Balance of saving account is " + savingAcc.getBalance());
        System.out.print("Withdraw: ");
        withDrawn = in.nextDouble();
        savingAcc.withDraw(withDrawn);
        System.out.println("Balance of saving account is " + savingAcc.getBalance());
        System.out.println("This account was created at " + savingAcc.getDateCreated());
    }
}