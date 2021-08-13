import java.util.ArrayList;
import java.util.Random;

public class Deck {
    public int size = 52;
    public ArrayList<Card> CardList = new ArrayList<Card>();
    public Deck() {
        for(int n = 1; n < 14; n++) {
            for(String s: Card.suits) {
                CardList.add(new Card(n, s));
            }
        }
    }
    public Deck(boolean empty) {
        if (empty==false){
            for(int n = 1; n < 14; n++) {
                for(String s: Card.suits) {
                    CardList.add(new Card(n, s));
                }
            } 
        }
    }
    public String toString() {
        String output = "";
        return CardList.toString();
    }   
    public void Shuffle() {
        for(int x = 1; x < 52; x++) {
            Card temp = CardList.remove(0);
            int r = (int) Math.floor(Math.random()*51);
            CardList.add(r, temp);
        }
    }
    public Card draw() { 
        return CardList.remove(0);
    }
    public void add(Card c) {
        CardList.add(c);
    }
}