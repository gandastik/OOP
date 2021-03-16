import java.util.ArrayList;
import java.util.Date;
public class Account {
    protected int id;
    protected String name;
    protected double balance;
    protected double annualInterestRate;
    protected Date dateCreated;
    protected ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    //Constructures
    Account(){
        this.id = 1111;
        this.balance = 1000;
        this.dateCreated = new Date();
    }
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    Account(int id, double balance, String name){
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.dateCreated = new Date();
    }


    //Accessors
    public int getId(){
        return this.id;
    }
    public double getBalance(){
        return this.balance;
    }
    public double annualInterestRate(){
        return this.annualInterestRate;
    }
    public Date getDateCreated(){
        return this.dateCreated;
    }
    public String getName(){
        return this.name;
    }
    public ArrayList<Transaction> getTransactions(){
        return this.transactions;
    }
    public String toString(){
        return "Account{id=" + this.id + ", name=" + this.name + ", balance=" + this.balance + ", annualInterestRate=" + this.annualInterestRate + 
        ", dateCreated=" + this.dateCreated;
    }

    //Mutators
    public void setId(int newId){
        this.id = newId;
    }
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate){
        this.annualInterestRate = newAnnualInterestRate / 100;
    }

    //Functions
    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12.0;
    }
    public double getMonthlyInterest(){
        return this.balance * this.getMonthlyInterestRate();
    }
    public void withDraw(char type, double amount, String discription){
        if(amount < 0){
            return;
        }
        else if(amount > this.balance){
            return;
        }
        this.balance -= amount;
        this.transactions.add(new Transaction( type, amount, this.balance, discription));
    }
    public void deposit(char type, double amount, String discription){
        if( amount < 0 ) {
            return;
        }
        this.balance += amount;
        this.transactions.add(new Transaction(type, amount, this.balance, discription));
    }
}
