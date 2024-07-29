import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        final int EMPLOYEES = 5;
        double payRate;
        double grossPay;
        Scanner input = new Scanner(System.in);
        int [] hours = new int [EMPLOYEES];
        for (int i = 0; i< EMPLOYEES;i++){
            System.out.println("Enter the hours worked by Employee #" + (i+1) );
            hours [i] = input.nextInt();
        }
        payRate =23;
        for (int j=0; j<EMPLOYEES; j++){
            System.out.println("Employee #"+ (j+1) + " pay is $" + hours[j]*payRate);
            System.out.println();
        }
    }
}
