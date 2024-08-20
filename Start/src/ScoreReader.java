/*
import java.io.*;
import  java.util.Scanner;
public class ScoreReader {
    public static void main(String[] args) throws IOException {
        Integer number = 0;
        File file = new File("Text.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String content = input.next();
            String[] token = content.split(",");
            for (String has : token) {
                int number = has;
                System.out.println(has);
            }
            System.out.println("**************");
        }
    }
}
*/
import java.io.*;
import  java.util.Scanner;

public class ScoreReader{
    private Scanner input;
    private String line;
    public ScoreReader(String filename) throws IOException{
        File file = new File(filename);
        input = new Scanner(file);
    }
    public boolean readNextLine(){
        boolean readNext = input.hasNext();
        if (readNext){
            line = input.nextLine();
        }
        return readNext;
    }
    public double getAverage(){
        double total = 0.0;
        String [] token = line.split(",");
        for (String number : token){
            int privateNumber = Integer.parseInt(number);
            total += privateNumber;
        }
        int sum;
        return total/token.length;
    }
    public void close()throws IOException{
        input.close();
    }
}
