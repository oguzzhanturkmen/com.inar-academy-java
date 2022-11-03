package chapters.chapter_09;

public class Stock {

    private String symbol;
    private String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String symbol, String name , double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
    public double getChangePercent(){
        return currentPrice / previousClosingPrice;
    }

}
