

import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double MPH,KPH;
        int end = input.nextInt();
        for(KPH=60;KPH<=end && KPH!=200;KPH+=10){
            MPH = KPH * 0.6214;
//            System.out.println("Enter a number");
            System.out.printf(KPH + "\t\t" + "%1.2f \n",MPH);
        }
    }
}