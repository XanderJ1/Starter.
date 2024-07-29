import java.io.*;
import java.util.Scanner;
public class methodTest {
    public static void main(String[] args) throws IOException{
        final int MONTHS = 30;
        //Get filename
        String filename = getFilename();
        System.out.println(filename);
        //Get totalSales
        int totalSales = totalSale(filename);
        double average = average(totalSales,MONTHS);
        displayResults(totalSales,average);
    }
    public static String getFilename(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the filename");
        return in.next();
    }
    public static int totalSale(String filename) throws IOException {
        File file = new File(filename);
        Scanner input = new Scanner(file);
        int totalSales = 0;
        while (input.hasNext()) {
            totalSales = 0;
            for (int i = 1; i <= 4; i++) {
                int sale = input.nextInt();
                totalSales += sale;
            }
        }
        input.close();
        return totalSales;
    }
    public static double average(double totalSale,double months) {
        return totalSale/months;
    }
    public static void displayResults(int sales, double average) {
        System.out.println("The total sales of the month was " + sales);
        System.out.printf("The average sale of the month was " + "%.2f",average);

    }
}



















/*        Scanner in = new Scanner(System.in);
        //inputFile();
        System.out.println("Enter the filename");
        String filename = in.next();
        File file = new File(filename);
        Scanner input = new Scanner(file);
        while (input.hasNext()){
            int sale = 0;
            sale += input.nextInt();
            System.out.println(sale);
        }
        input.close();
    }}

    /**
     * Ask the user to enter the name of the file
     */
/*     public static void inputFile() throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the filename");
        String filename = in.next();
        File file = new File(filename);
        Scanner input = new Scanner(file);
        String sales = input.next();
        System.out.println(sales);
        input.close();
    }
    /**
     * This method calculates the sum of the sales
    */
/*   public static int sumSales(int sales){
        Scanner in = new Scanner(System.in);
        for (int i=1; i<=5; i++){
            int totalSales = 0;
            System.out.println("Enter number of sales");
            int numSales = in.nextInt();
            for (int j=1; j<=numSales;j++){
                int sale = in.nextInt();
                totalSales += sale;
            }
            return totalSales;
        }
        return sales;
    }
}
*/