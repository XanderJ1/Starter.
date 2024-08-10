

import javax.swing.JOptionPane;

/**
     This code takes student score and grades the student.
 */
public class GradingSystem {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter Mark");
        int marks = Integer.parseInt(input);
        if (marks >= 90)
            JOptionPane.showMessageDialog(null,"You got an A");
// First move
        else if (marks >= 80)
            JOptionPane.showMessageDialog(null,"You got a B");
//Second move
        else if (marks >= 70)
            JOptionPane.showMessageDialog(null,"You got a C");
//Third Move
        else if (marks >= 60)
            JOptionPane.showMessageDialog(null,"You got a D");

        else 
            JOptionPane.showMessageDialog(null,"You got a F");

        System.exit(0);
    }
}
