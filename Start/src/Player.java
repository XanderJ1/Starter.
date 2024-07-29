import java.util.Random;

public class Player {
    private String name;
    private String guess;
    private int points;
    public Player(String name){
        this.name = name;
        guess = "";
        points = 0;
    }
    public String guess(){
        Random rand = new Random();
        int guessNumber = rand.nextInt(2);
        if (guessNumber==0){
            guess = "Even";
        }
        else {
            guess = "Odd";
        }
        return guess;
    }
    public void Points(int newPoints) {
        points += newPoints;
    }
    public String getPlayer(){
        return name;
    }
    public String getGuess(){
        return guess;
    }
    public int getpoints(){
        return points;
    }

    public static void main(String[] args) {
        Player play = new Player("Akwasi");
        play.guess();
        play.getGuess();
        System.out.println(play.getPlayer());
        System.out.println(play.guess());
    }
}