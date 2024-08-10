

/**
 * Demonstrates the Stock class
 */
public class Stock1 {
    public static void main(String[] args) {
        Stock stock = new Stock("Amazon", 2300);
        Stock stock1 = new Stock("Chrome", 2300);
        Stock newStock;
        newStock = stock.copy();
        System.out.println(stock);
        if (stock.equal(stock1)){
            System.out.println("YES!");
        }
        else
            System.out.println("NO!");
        System.out.println(newStock);
    }
}
