import java.util.*;

public class Player{

    String name;
    ArrayList<String> cardList = new ArrayList<>();
    HashMap<String,Integer> cardMap = new HashMap<>();

    public Player(String name){
        this.name = name;
    }

    public void setCardList(String card){
        cardList.add(card);
    }

    public void getCardList(){
        //get all cards inside cardList
        for(String position : cardList){
            System.out.print(position+", ");
        } 
    }

    public void getUniqueCards(){
        String[] suit = {"Clubs", "Diamonds", "Hearts","Spades"};
        
        for(int i=0; i < suit.length ; i++){            
            String suitValue = suit[i];
            
            for(String card : cardList){

                if(card.contains(suitValue)){
                    
                    if(cardMap.containsKey(suitValue)){
                        // increment count here
                        cardMap.put(suitValue, cardMap.get(suitValue) + 1);
                    }else{
                        // add new keyvalue pair to HashMap
                        cardMap.put(suitValue, 1);
                    }
                }
            } 

        }
        // Print the values
        for (String card: cardMap.keySet()) {
        
            String key = card.toString();
            int value = cardMap.get(key);
            System.out.println(key + " " + value);
        }

    }
    public void displayCards(){
        String[] rank = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        for(int i=0; i < rank.length ; i++){            
            String rankValue = rank[i];
            
            for(String card : cardList){

                if(card.contains(rankValue)){
                    
                   System.out.print(card+" "); 

                }
            } 

        }

    }
    
}