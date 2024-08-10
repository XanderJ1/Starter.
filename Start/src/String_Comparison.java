
import javax.swing.*;
/**
 This program is used to verify a password variables
 */
public class String_Comparison {
    public static void main(String[] args) {
        //Strings
        String password="Mark";
        String verify = JOptionPane.showInputDialog("Enter the password");
        if (verify.equalsIgnoreCase(password)){
            JOptionPane.showMessageDialog(null,"Congratulations\n" +
                    "You are in");
        }
        else {
            JOptionPane.showMessageDialog(null,"Sorry\n" +
                    "You are out");
        }
        String velify = JOptionPane.showInputDialog("Enter the password");
        JOptionPane.showMessageDialog(null,
                (velify.equalsIgnoreCase(password) ?  "Congratulations\n"+ "Your'e in": "Sorry\n"+ "Try again later")
        );
    }
}
