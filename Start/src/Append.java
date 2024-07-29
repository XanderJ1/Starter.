import java.io.*;
import java.util.Scanner;

public class Append {
    public static void main(String[] args) throws IOException{
    Scanner input = new Scanner(System.in);
    FileWriter in = new FileWriter("friends_list.txt", true);
    PrintWriter output = new PrintWriter(in);
    System.out.println("How many friends you got?");
    int numFriends = input.nextInt();
    for(int i=1;i<=numFriends;i++){
        System.out.println("Enter your fiend's name");
        String name = input.next();
        output.println(name);
    }
    output.close();

    }
}
