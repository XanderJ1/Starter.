public class salesData {
    private final double [] sales;
    public salesData(double [] sales) {
        this.sales  = new double [sales.length];
        for (int i=0; i < sales.length; i++){
            this.sales[i] = sales[i];
        }
    }
    public double getTotal(){
        double total = 0;
        for (int i=0; i< sales.length; i++){
            total += sales[i];
        }
        return total;
    }
    public double getAverage(){
        return getTotal()/ sales.length;
    }
    public double getHighest(){
        double highest = sales[0];
        for (int i=0; i< sales.length;i++){
            if (sales[i] > highest){
                highest = sales[i];
            }
        }
        return highest;
    }
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
        salesData sell = new salesData(array);
        System.out.println(sell.getTotal());
        System.out.println(sell.getAverage());
        System.out.println(sell.getHighest());
        System.out.println(sell.getLowest());

    }
}
