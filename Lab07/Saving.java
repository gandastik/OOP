public class Saving extends Account{
    public Saving(){
    }
    public Saving(int id, double balance) {
        super(id, balance);
    }
    public Saving(int id, double balance, String name){
        super(id, balance, name);
    }
    
    //Methods
    public void withDraw(double amount_of_money){
        if(amount_of_money < 0){
            return;
        }
        else if(amount_of_money > this.balance){
            return;
        }
        this.balance -= amount_of_money;
    }

    public String toString(){
        return super.toString();
    }
}