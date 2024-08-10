
import java.util.Scanner;
public class StaticMethods {
    public static void main(String[] args) {
        BankAccount2 account;
        account = getAccount();
        System.out.println("New balance is " + account.getBalance());
    }
    public static BankAccount2 getAccount(){
        Scanner input = new Scanner(System.in);
        int balance;
        balance = input.nextInt();
        return new BankAccount2(balance);
    }
}
