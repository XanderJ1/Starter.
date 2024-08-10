

/**
 * This is to calculate for the total, average, lowest and highest sale in the month
 */
public class SalesData {
    private final double [] sales;
    public SalesData(double [] sales) {
        this.sales  = new double [sales.length];
        for (int i=0; i < sales.length; i++){
            this.sales[i] = sales[i];
        }
    }

    /**
     * Calculate for the total sale
     * @return The total sales
     */
    public double getTotal(){
        double total = 0;
        for (int i=0; i< sales.length; i++){
            total += sales[i];
        }
        return total;
    }

    /**
     * Calculate for the average sale
     * @return The average sale
     */
    public double getAverage(){
        return getTotal()/ sales.length;
    }

    /**
     * Determine the bash.Append.array with the highest value
     * @return The item with the highest value in the bash.Append.array
     */
    public double getHighest(){
        double highest = sales[0];
        for (int i=0; i< sales.length;i++){
            if (sales[i] > highest){
                highest = sales[i];
            }
        }
        return highest;
    }

    /**
     * Determine the lowest value in the bash.Append.array
     * @return The item with the lowest value
     */
    public double getLowest(){
        double lowest = sales[0];
        for (int i=0; i< sales.length;i++){
            if (sales[i] < lowest){
                lowest = sales[i];
            }
        }
        return lowest;
    }
    public static void main(String[] args) {
        double[] array = {3,9,10,3,17,7};
        SalesData sell = new SalesData(array);
        System.out.println(sell.getTotal());
        System.out.println(sell.getAverage());
        System.out.println(sell.getHighest());
        System.out.println(sell.getLowest());

    }
}
