package bash;
import java.util.Scanner;
import java.io.*;
/**
 * This is used to read input from the keyboard
 */
public class Read {
    public static void main(String[] args) throws IOException{
//      Create a Scanner object for filename
        Scanner input = new Scanner(System.in);
//      Get filename
        System.out.println("Enter filename");
        String filename = input.nextLine();
//      Open file
        File file = new File(filename);
        Scanner in = new Scanner(file);
        //Read the first line
        String content = in.next();
        //Display the first line in the file
        System.out.println(content);
        String dest = in.next();
        System.out.println(dest);
        in.close();

    }
}
