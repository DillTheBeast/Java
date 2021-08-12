
public class Card {
    private int number;
    private String suit;
    public static final String[] suits = {"Diamond","Heart","Spade","Club"};
    public static void main(String[] args) {
        Card c = new Card(5, "Diamond");
        System.out.println(c);
    }
    public Card(int number, String s) {
        this.number = number;
        this.suit = s;
    }
    public int getNumber() {
        return number;
    }
    public String getSuit() {
        return suit;
    }
    public String toString() {
        if(number == 1) {
            return  "The Ace of " + suit + "s";
        }
        if(number == 11) {
            return  "The Jack of " + suit + "s";
        }
        if(number == 12) {
            return  " The Queen of " + suit + "s";
        }
        if(number == 13) {
            return  "The King of " + suit + "s";
        }
        return  number + " of " + suit + "s";
        
    }
}