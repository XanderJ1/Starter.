

/**
 * This class holds the data for a stock.
 */
public class Stock {
    private String stock;
    private double sharePrice;

    public String getStock() {
        return stock;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    /**
     *
     * @param stock Trading symbol for a stock
     * @param sharePrice Current price of a stock
     */
    public Stock(String stock, double sharePrice) {
        this.stock = stock;
        this.sharePrice = sharePrice;
    }

    //Copy a constructor's data
    public Stock(Stock object){
        stock = object.stock;
        sharePrice = object.sharePrice;
    }
    //Assign 0 shares to a stock whose share price is unknown
    public Stock(String stock){
        this(stock, 0.0);
    }
    public String toString(){
        return "Trading symbol:" + stock + "\nCurrent price: "
                + sharePrice;
    }
    public Stock copy(){
        Stock copy = new Stock(stock,sharePrice);
        return copy;
    }
    public boolean equal(Stock object){
        boolean status;
        if (stock.equals(object.stock)
                && sharePrice == object.sharePrice){
            status = true;
        }
        else
            status = false;
        return status;
    }
}