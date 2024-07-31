package bash;

import java.util.Scanner;
public class hanCho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player name");
        String player1Name  = input.next();
        System.out.println("Enter player name");
        String player2Name  = input.next();
        Dealer dealer = new Dealer();
        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);
        // Dealer Roll dice
        dealer.setRoll();
        player1.guess();
        player2.guess();
        System.out.println(player1.getPlayer());
        System.out.println(player1.getGuess());
        winner(dealer,player1,player2);
        int fist = player1.getpoints();
        int secnd = player2.getpoints();
        System.out.println(fist);
        System.out.println(secnd);
    }
    public static void winner(Dealer dealer, Player player1, Player player2){
        checkGuess(dealer,player2);
        checkGuess(dealer,player1);
    }
    public static void checkGuess(Dealer dealer, Player player){
        String guess = player.guess();
        String result = dealer.hanCho();
        if (guess.equals(result)){
            player.Points(1);
        }
    }
}