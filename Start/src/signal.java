import java.io.IOException;
import java.util.Scanner;
public class signal{
    public static void main(String[] args) throws IOException {
        System.out.print("Filename: ");
        Scanner input = new Scanner(System.in);
        String text = input.next();
        ScoreReader read = new ScoreReader(text);
        read.readNextLine();
        double average = read.getAverage();
        System.out.println("Average: " + average);
        //Next line
        read.readNextLine();
        double average2 = read.getAverage();
        System.out.println("Average2: " + average2);
        read.readNextLine();
        double average3 = read.getAverage();
        System.out.println("Average3: " + average3);
        read.readNextLine();
        double average4 = read.getAverage();
        System.out.println("Average4: " + average4);
    }

}