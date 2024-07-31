package bash;

public class variableBank{
    private double total = 0;
    public variableBank(bankAccount2... bankAccount){
        for(bankAccount2 val : bankAccount){
            total += val.getBalance();
        }
    }
    public double calca(){
        return total;
    }
}
