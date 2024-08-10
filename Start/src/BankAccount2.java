public class BankAccount2 {
    private double balance;

    public BankAccount2(){
        balance = 0;
    }
    public BankAccount2(double balance){
        this.balance = balance;
    }
    public BankAccount2( String balance){
        this.balance = Double.parseDouble(balance);
    }
    public void Deposit(int amount){
        balance += amount;
    }
    public void Deposit(String amount){
        balance += Integer.parseInt(amount);
    }
    public void withdrawal(int withdraw){
        balance -= withdraw;
    }
    public void withdrawal(String withdrawal){
        balance -= Integer.parseInt(withdrawal);
    }
    public double getBalance(){
        return balance;
    }
}
