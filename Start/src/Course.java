

/**
 * This stores data about a course
 */
public class Course {
    private String course;
    private Instructor instructor;
    private Textbook textBook;

    /**
     * Takes data for the course fields
     * @param name Course name
     * @param instructor Instructor for the course
     * @param textbook Textbook for the course
     */
    public Course (String name, Instructor instructor,Textbook textbook){
        course = name;
        this.instructor = new Instructor(instructor);
        this.textBook = new Textbook(textbook);
    }

    public String toString() {
        return  "Course name: " + course +
                "\nInstructor Information:\n" +
                instructor +
                "\nTextbook Information:\n" +
                textBook;
    }
}
