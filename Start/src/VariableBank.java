public class VariableBank{
    private double total = 0;
    public VariableBank(BankAccount2... BankAccount){
        for(BankAccount2 val : BankAccount){
            total += val.getBalance();
        }
    }
    public double calca(){
        return total;
    }
}
