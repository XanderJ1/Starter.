import java.util.Scanner;
public class saleData {
    private double sales[];
    public saleData(double [] sale){
        sales = new double[sale.length];
        for (int i=0; i<sale.length;i++){
            sales[i] = sale[i];
        }
        System.out.println();
    }
    public double getTotal(){
        double total = 0.0;
        for (int j=0; j< sales.length;j++){
            total += sales[j];
        }
        return total;
    }
    public double getAverage(){
        return getTotal()/sales.length;
    }
    public double highest(){
        double highest=0;
        for (int i=0; i<sales.length; i++){
            if (sales[i] > highest){
                highest = sales[i];
            }
        }
        return highest;
    }
    public static void getSales(double values[]){
        Scanner input = new Scanner(System.in);
        for (int i=1; i< values.length;i++){
            values[i] = input.nextInt();
        }
    }
    public static void main(String[] args) {
        double numbers[] = new double [6];
        getSales(numbers);
        saleData test = new saleData(numbers);
        System.out.println(test.getTotal());
        System.out.printf("%.2f",test.getAverage());
        System.out.println("\n" + test.highest());
    }
}