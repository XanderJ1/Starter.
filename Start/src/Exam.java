import javax.swing.JOptionPane;
public class Exam {
    public static void main(String[] args) {
        String input;
        input = JOptionPane.showInputDialog("Enter number of questions");
        int numberOfQuestions = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter numer of questions missed");
        int numOfQuestionsMissed = Integer.parseInt(input);
        FinalExam exams = new FinalExam(numberOfQuestions, numOfQuestionsMissed);

        double numMissed = exams.getNumMissed();

         JOptionPane.showMessageDialog(null,
                 "Number of questions missed: "+ numMissed
                 + "\nNumber of point each: " + exams.getPointsEach()
         + "\nScore: " + exams.getScore() + "\nGrade: " + exams.getGrade());

         System.exit(0);
    }
}
