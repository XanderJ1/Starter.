package bash;

public class bankAccount2 {
    private double balance;

    public bankAccount2(){
        balance = 0;
    }
    public bankAccount2(double balance){
        this.balance = balance;
    }
    public bankAccount2( String balance){
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
