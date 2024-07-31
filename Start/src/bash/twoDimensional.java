package bash;

import java.util.Scanner;
/**
 * This is a two-dimensional bash.Append.array
 */
public class twoDimensional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double [][] score = new double[4][3];
        for (int i=0; i< 4; i++){
            for (int j=0; j<3; j++){
                score[i][j] = (int) (Math.random() *10);
            }
        }

        System.out.println("Number of rows "+ score.length);
        for (int i= 0; i< 4; i++){
            for (int j=0; j<3; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}