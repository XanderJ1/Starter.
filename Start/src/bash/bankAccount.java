package bash;

public class bankAccount {
    public static void main(String[] args) {
        bankAccount2 bank = new bankAccount2(670);
        bankAccount2 bank1 = new bankAccount2(670);
        bankAccount2 bank2 = new bankAccount2(60);
        bankAccount2 bank3 = new bankAccount2(630);
        bankAccount2 bank4 = new bankAccount2(80);
        bankAccount2 bank5 = new bankAccount2(730);
        bankAccount2 bank6 = new bankAccount2(960);
        System.out.println("******************************");
        variableBank danke = new variableBank(bank1,bank3,bank2,bank4,bank);
        double calca = danke.calca();
        System.out.println(calca);
        double wis = variableBank(bank2,bank1,bank3,bank4,bank);
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
    public static double variableBank(bankAccount2... bankAccount){
        double total =0 ;
        for(bankAccount2 val : bankAccount){
            total += val.getBalance();
        }
        return total;
    }
}
