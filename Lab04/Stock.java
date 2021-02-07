public class Stock {
    private String symbol;
    private String name;
    public double previousClosingPrice;
    public double currentPrice;

    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent(){
        return (this.currentPrice - this.previousClosingPrice)/ this.previousClosingPrice * 100;
    }
}
