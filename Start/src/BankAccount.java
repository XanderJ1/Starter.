
public class BankAccount {
    public static void main(String[] args) {
        BankAccount2 bank = new BankAccount2(670);
        BankAccount2 bank1 = new BankAccount2(670);
        BankAccount2 bank2 = new BankAccount2(60);
        BankAccount2 bank3 = new BankAccount2(630);
        BankAccount2 bank4 = new BankAccount2(80);
        BankAccount2 bank5 = new BankAccount2(730);
        BankAccount2 bank6 = new BankAccount2(960);
        System.out.println("******************************");
        VariableBank danke = new VariableBank(bank1,bank3,bank2,bank4,bank);
        double calca = danke.calca();
        System.out.println(calca);
        double wis = VariableBank(bank2,bank1,bank3,bank4,bank);
        System.out.println(wis);
        System.out.println("******************************");
        bank.withdrawal(2000);
        bank.Deposit(30000);
        int withdrawal =2000;
        int deposit =30000;
        double balance = bank.getBalance();
        System.out.println("The name of the bank is: John");
        System.out.println("Withdrawal made is: " + withdrawal);
        System.out.println("Deposit made is: " + deposit);
        System.out.println("Your remaining balance is: " +balance);
    }
    public static double VariableBank(BankAccount2... BankAccount){
        double total =0 ;
        for(BankAccount2 val : BankAccount){
            total += val.getBalance();
        }
        return total;
    }
}
