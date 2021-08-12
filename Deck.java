import java.util.ArrayList;

public class Deck {
    public int size = 52;
    public ArrayList<Card> CardList = new ArrayList<Card>();
    public static void main(String[] args) {
        Deck d = new Deck();
    }
    public Deck() {
        for(int n = 1; n < 14; n++) {
        CardList.add(new Card(n,"Diamonds"));
        }
    }
}