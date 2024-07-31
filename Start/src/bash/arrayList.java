package bash;
import java.util.ArrayList;
import java.util.Scanner;
public class arrayList{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("James");
        nameList.add("Akwasi");
        for (int i=0; i<6;i++){
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
