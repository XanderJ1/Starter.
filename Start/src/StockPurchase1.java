

public class StockPurchase1 {
    public static void main(String[] args) {
        Stock cash = new Stock("AMZ", 243);
        StockPurchase cost = new StockPurchase(cash, 23);
        System.out.println(cost);
    }
}
