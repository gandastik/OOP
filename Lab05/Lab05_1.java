import java.util.Scanner;
public class Lab05_1{
    public static void main(String[] args){
        //Initailize the balance to 20000 and ID to 1122
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter the amount of money you wish to withdrawn from the accont: ");
            double withDrawn = in.nextDouble();
            if(withDrawn < 0 || withDrawn > account.getBalance()){
                System.out.println("You cannot withdrawn due to invalid input");
            }
            else {
                account.withDraw(withDrawn);
                System.out.print("The account balance after withdraw $" + withDrawn);
                System.out.println(" : $" + account.getBalance());
                break;
            }
        }
        while(true){
            System.out.print("Enter the amount of money you wish to deposit to the accont: ");
            double deposited = in.nextDouble();
            if(deposited < 0){
                System.out.println("You cannot deposit due to the invalid input");
            }
            else{
                account.deposit(deposited);
                System.out.print("The account balance after deposit $" + deposited);
                System.out.println(" : $" + account.getBalance());
                break;
            }
        }
        System.out.println("The account monthly interest is " + account.getMonthlyInterest());
        System.out.println("Account created at " + account.getDateCreated());
    }
}