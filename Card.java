
public class Card {
    private int number;
    private String suit;
    public static void main(String[] args) {
        Card c = new Card(5, "Diamond");
        System.out.println(c);
    }
    public Card(int number, String suit) {
        this.number = number;
        this.suit = suit;
    }
    public int getNumber() {
        return number;
    }
    public String getSuit() {
        return suit;
    }
    public String toString() {
        if(number == 1) {
            return  "Ace of " + suit + "s";
        }
        if(number == 11) {
            return  "Jack of " + suit + "s";
        }
        if(number == 12) {
            return  "Queen of " + suit + "s";
        }
        if(number == 13) {
            return  "King of " + suit + "s";
        }
        return  number + " of " + suit + "s";
        
    }
}