

public class StockPurchase {
    private Stock stock;
    //Number of shares to purchase
    private int numShares;
    public StockPurchase(Stock stock1, int numShares){
        stock = new Stock(stock1);
        this.numShares = numShares;
    }

    public Stock getStock() {
        return stock;
    }
    public double getCost(){
        return numShares * stock.getSharePrice();
    }
    public String toString(){
        return "The cost of the share is: " + getCost();
    }
}
