public class Lab07_2{
    public static void main(String[] args){
        Account acc = new Account(1122, 1000, "George");
        acc.setAnnualInterestRate(1.65);
        acc.deposit('D', 30.0,"abc");
        acc.deposit('D', 40.0,"abc");
        acc.deposit('D', 50.0,"abc");
        acc.withDraw('W', 5.0,"abc");
        acc.withDraw('W', 4.0,"abc");
        acc.withDraw('W', 2.0,"abc");
        System.out.println("Name: " + acc.getName());
        System.out.println("Account ID: " + acc.getId());
        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Date \t\t\t\tType \tAmount \tBalance");
        for(int i=0;i<acc.getTransactions().size();i++){
            System.out.println(acc.getTransactions().get(i).getDate() + "\t" + acc.getTransactions().get(i).getType() + "\t" + acc.getTransactions().get(i).getAmount() + "\t" + acc.getTransactions().get(i).getBalance());
        }
    }
}