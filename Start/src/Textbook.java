

public class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author,
                    String publisher){
        this.title = title;
        this.author = author;
        this.publisher =publisher;
    }
    public Textbook(Textbook object){
        title = object.title;
        author = object.author;
        publisher = object.publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Title: " + title +
                "\nAuthor: "+ author+ "\nPublisher: " + publisher;
    }
}
