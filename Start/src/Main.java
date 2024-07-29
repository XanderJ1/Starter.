import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       String input = JOptionPane.showInputDialog("Enter  your salary");
       double salary = Double.parseDouble(input);
       String in = JOptionPane.showInputDialog("Enter number of work years");
       int years = Integer.parseInt(in);
       JOptionPane.showMessageDialog(null, salary);
       JOptionPane.showMessageDialog(null, years);
       // If

    }
}