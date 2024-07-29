import java.util.Scanner;
public class sequentialSearch {
    public sequentialSearch(int[] numbers, int test){
        boolean x = true;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] == test){
                x = true;
            }
            else {
                x = false;
            }
        }
        if (x == true){
            System.out.println("yes");
        }
        else
            System.out.println("NO!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,100};
        int test = input.nextInt();
        sequentialSearch search = new sequentialSearch(numbers, test);
    }
}
