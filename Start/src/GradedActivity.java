public class GradedActivity {
    private double score;
    public void setScore(double s){
         score = s;
    }
    public double getScore(){
        return score;
    }
    public char getGrade(){
        char grade;
        if (score >= 80)
            grade = 'A';
        else if (score >= 70)
            grade = 'B';
        else if(score >= 60)
            grade = 'C';
        else if (score >= 50)
            grade = 'D';
        else
            grade = 'F';
        return grade;
    }
}
