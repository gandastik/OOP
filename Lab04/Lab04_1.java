import java.util.Scanner;

public class Lab04_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Symbol: ");
        String symbol = in.nextLine();
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Previous Closing Price: ");
        double prev = in.nextDouble();
        System.out.print("Current Price: ");
        double curr = in.nextDouble();
        Stock stock = new Stock(symbol, name);
        stock.currentPrice = curr;
        stock.previousClosingPrice = prev;
        System.out.println("Price Change: " + stock.getChangePercent() + "%");
    }
}
