package bash;
import bash.Dice;

public class Dealer {
    private int value1;
    private int value2;
    public void setRoll(){
        Dice roll1 = new Dice();
        Dice roll2 = new Dice();
        value1 = roll1.getDiceValue();
        value2 = roll2.getDiceValue();
    }
    public int getValue1(){
        return value1;
    }
    public int getValue2(){
        return value2;
    }
    public String hanCho(){
        String hanCho;
        int sum = value1+value2;
        int result = sum%2;
        if (result == 0){
            hanCho ="Even";
        }
        else {
            hanCho= "Odd";
        }
        return hanCho;
    }
    public static void main(String[] args) {
        Dealer test = new Dealer();
        test.setRoll();
        System.out.println(test.getValue1());
        System.out.println(test.getValue2());
        System.out.println(test.hanCho());
    }
}
