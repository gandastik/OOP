import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

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
    public void withDraw(double amount_of_money){
        if(amount_of_money < 0){
            return;
        }
        else if(amount_of_money > this.balance){
            return;
        }
        this.balance -= amount_of_money;
    }
    public void deposit(double amount_of_money){
        this.balance += amount_of_money;
    }
}
