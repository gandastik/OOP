import java.util.Date;
public class Transaction{
    private Date date; 
    private char type;
    private double amount;
    private double balance;
    private String discription;

    //Constructure
    public Transaction(char type, double amount, double balance, String discription){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.discription = discription;
        this.date = new Date();
    }

    //Methods
    public Date getDate(){
        return this.date;
    }
    public char getType(){
        return this.type;
    }
    public double getAmount(){
        return this.amount;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getDiscription(){
        return this.discription;
    }
    
}