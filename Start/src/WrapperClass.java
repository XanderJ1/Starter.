import java.util.Scanner;
import javax.swing.JOptionPane;
public class WrapperClass{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        boolean isValid = false;
        text = JOptionPane.showInputDialog("Enter with format, LLLNNN");
        if (isValid(text))
            System.out.println("Yes!");
        else
            System.out.println("No!");

    }
    public static boolean isValid(String text){
        boolean test = true;
        int i=0;
        if (text.length() != 6){
            test = false;

                while (test && i<3){
                    if (!Character.isLetter(text.charAt(i)))
                        test = false;
                    i++;
                }
                while (test && i<7) {
                    if (!Character.isDigit(text.charAt(i)))
                        test = false;
                    i++;
                }
            }
        return test;
    }
}