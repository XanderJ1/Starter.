
import java.util.Scanner;
/**
 This code is an implementation of methods
 */
public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Lets do an Addition");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = James(num1,num2);
        System.out.println(sum);
    }

    /**
     This code adds two numbers
     @param first The first number
     @param second The second number
     @return The sum of the two numbers
     */
    public static int James(int first, int second){
        int sum = first + second;
        return(sum);
    }
}