import java.util.ArrayList;
import java.util.Random;

public class Deck {
    public int size = 52;
    public static ArrayList<Card> CardList = new ArrayList<Card>();
    public static void main(String[] args) {
        Deck d = new Deck();
        Deck d2 = new Deck();
        d.Shuffle();
        System.out.println(d);

    }
    public Deck() {
        for(int n = 1; n < 14; n++) {
            for(String s: Card.suits) {
                CardList.add(new Card(n, s));
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
            int r = (int) Math.floor(Math.random()*(52-1+1)+1);
            CardList.add(r, temp);
        }
    }
}