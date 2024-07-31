package bash;

import java.util.Random;
public class Dice {
    private final int SIDES = 6;
    private int diceValue;
    public int getDiceValue(){
        Random rand = new Random();
        diceValue += rand.nextInt(SIDES);
        return diceValue;
    }
    public static void main(String[] args) {
        Dice geg = new Dice();
        System.out.println(geg.getDiceValue());
    }
}
