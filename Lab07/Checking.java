public class Checking extends Account {
    private double overdraftLimit;    

    //Constructures
    public Checking() {
        super();
        this.overdraftLimit = 5000;
    }
    public Checking(int id, double balance) {
        super(id, balance);
    }
    public Checking(int id, double balance, String name){
        super(id, balance, name);
    }

    //Modifiers
    public void setOverdraftLimit(double amount_of_money) {
        this.overdraftLimit = amount_of_money;
    }

    //Methods
    public void withDraw(double amount_of_money){
        if(super.balance - amount_of_money < -1 * this.overdraftLimit) return;
        else super.balance -= amount_of_money;
    }

    
    
}