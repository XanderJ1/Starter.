import javax.swing.JOptionPane;
public class Grade {
    public static void main(String[] args) {
        GradedActivity grading = new GradedActivity();
        String scoree = JOptionPane.showInputDialog("Enter student score");
        double studentScore = Double.parseDouble(scoree);
        grading.setScore(studentScore);
        double score = grading.getScore();
        char grade = grading.getGrade();
        JOptionPane.showMessageDialog(null, "Score: " + score
                + "\nGrade: "+ grade);
    }
}
