import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HasNext {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name");
        String filename = input.next();
        File file = new File(filename);
        // Get content of the file
        Scanner content = new Scanner(file);
        String line = content.next();
        System.out.println(line);
        while (content.hasNext()){
            String next = content.next();
            System.out.println(next);
        }
        content.close();
    }
}
