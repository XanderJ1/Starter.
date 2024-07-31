package bash;

import java.util.Scanner;
import java.io.*;
public class Ray {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a file name");
        String filename = input.next();
        File file = new File(filename);
        Scanner out = new Scanner(file);
        int [] numbers = {2,4,7,1,9,6};
        while (out.hasNext()){
            String friendName = out.nextLine();
            System.out.println(friendName);
        }
        out.close();
    }
}
