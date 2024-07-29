public class bankAccount {
    public static void main(String[] args) {
        bankAccount2 bank = new bankAccount2();
        bank.setBankAccount(30);
        bank.withdrawal(2000);
        bank.Deposit(30000);
        int withdrawal =2000;
        int deposit =30000;
        int balance = bank.getBalance();
        System.out.println("The name of the bank is: John");
        System.out.println("Withdrawal made is: " + withdrawal);
        System.out.println("Deposit made is: " + deposit);
        System.out.println("Your remaining balance is: " +balance);
    }
}
