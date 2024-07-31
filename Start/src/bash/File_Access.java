package bash;

import java.io.*;
import java.util.Scanner;

public class File_Access {
    public static void main(String[] args) throws FileNotFoundException {
        String filename;
        String friends;
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name");
        filename = input.next();
        PrintWriter output = new PrintWriter(filename);
        System.out.println("How many friends do you have");
        num = input.nextInt();
        for(int i = 1; i<= num; i++){
            System.out.println("Write the names of your friends");
            friends = input.next();
            output.println(friends);
        }
        output.close();
    }
}
