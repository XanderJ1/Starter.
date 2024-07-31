package bash;

import javax.swing.*;

/**
  This Program determines if you are qualified for a loan.
*/
public class decisionStructures {
    public static void main(String[] args) {
        double salary;
        int yearsWorked;
        String input = JOptionPane.showInputDialog("Enter  your salary");
        salary = Double.parseDouble(input);
        if (salary >= 3500) {
            String in = JOptionPane.showInputDialog("Enter number of work years");
            yearsWorked = Integer.parseInt(in);
            if (yearsWorked >= 2) {
                JOptionPane.showMessageDialog(null, "You are qualified");
            }
             else {
                JOptionPane.showMessageDialog(null, "Sorry you're not qualified");
                }
            }
        else {
//            JOptionPane.showMessageDialog(null,"sorry you're not qualified");
                JOptionPane.showMessageDialog(null,"Sorry you're not qualified");
            }
    }
}

