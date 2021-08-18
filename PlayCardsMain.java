import java.util.*;

public class PlayCardsMain{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players :");
        int playerCount = sc.nextInt();

        PlayCards play = new PlayCards(playerCount);
        play.generateCards();
        play.addPlayer();
        play.setPlayerSequence();
        play.distributeCards();
        play.printCardList();
        
    }
}