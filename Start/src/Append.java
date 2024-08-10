import java.io.*;
import java.util.Scanner;

public class Append {
    public static void main(String[] args) throws IOException{
    Scanner input = new Scanner(System.in);
    FileWriter in = new FileWriter("friends_list.txt", true);
    PrintWriter output = new PrintWriter(in);
    System.out.println("How many friends you got?");
    int numFriends = input.nextInt();
    for(int i=1;i<=numFriends;i++){
        System.out.println("Enter your fiend's name");
        String name = input.next();
        output.println(name);
    }
    output.close();

    }

    public static class array {
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
}
