
import java.util.Scanner;
public class ArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        java.util.ArrayList<String> nameList = new java.util.ArrayList<String>();
        for (int i=0; i<5; i++){
            System.out.print("Enter a name: ");
            String name = input.next();
            nameList.add(name);
        }
        nameList.set(4,"Casey");
        for (String name: nameList){
            System.out.println(name);
        }
    }
}