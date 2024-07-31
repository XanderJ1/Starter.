package bash;
import java.util.Scanner;
public class Accumulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students");
        int numStudents = input.nextInt();
        System.out.println("Enter number of tests");
        int numTest = input.nextInt();
        for(int student=1; student<=3; student++){
            int total=0;
            System.out.println("Student" + student);
            for (int ave=1; ave<=numTest; ave++){
                System.out.println("Enter the score");
                int mark = input.nextInt();
                total +=mark;
            }
            int average = total/numTest;
            System.out.println("Student " + student + "'s average is: " + average);
        }
    }
}
