

public class Instructor2 {
    public static void main(String[] args) {
        Instructor teacher2;
        Instructor teacher = new Instructor("Moore",
                "Stephen","3230");
        teacher2 = new Instructor(teacher);
        System.out.println(teacher2);
        System.out.println(teacher);
    }
}
