

public class Course1 {
    public static void main(String[] args) {
        Instructor teacher = new Instructor("Moore",
                "Stephen","3230");
        Textbook book = new Textbook("Harry Potter","J.K. Rowling ", "OTW");
        Course course = new Course("Bash", teacher, book);
        System.out.println(course);
    }
}
