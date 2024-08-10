

public class Textbook1 {
    public static void main(String[] args) {
        Textbook harryPotter = new Textbook("Harry Potter",
                "J.K. Rowling ", "OTW");
        Textbook newBook;
        newBook = new Textbook(harryPotter);
        System.out.println("**********************\n"
                +"Original Book\n"
                +harryPotter);
        System.out.println("***********************\n"+
                "New Book\n"
                +newBook);
    }
}
