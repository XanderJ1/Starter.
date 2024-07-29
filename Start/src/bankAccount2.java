public class bankAccount2 {
    private int balance;

    public void setBankAccount(){
        balance = 0;
    }
    public void setBankAccount(int initialBalance){
        balance = initialBalance;
    }
    public void setBankAccount(String initialBalance){
        balance = Integer.parseInt(initialBalance);
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
        balance += Integer.parseInt(withdrawal);
    }
    public int getBalance(){
        return balance;
    }
}
