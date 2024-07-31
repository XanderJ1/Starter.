package bash;

import java.util.Scanner;
public class ASA {
    public static void main(String[] args) {
        final int numTests;
        int [] numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of tests");
        numTests = input.nextInt();
        numbers = new int[numTests];
        getValues(numbers);
        showValues(numbers);
    }
    public static void getValues(int numbers[]){
        Scanner in = new Scanner(System.in);
        for (int i=0; i< numbers.length;i++){
            System.out.println("Enter the score");
            numbers[i] = in.nextInt();
        }
    }
    public static void showValues(int numbers[]){
        for (int val: numbers){
            System.out.println("Scores entered are " + val);
        }
    }
}
