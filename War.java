import java.util.Scanner;
public class War {
    public static String input;
    public static boolean Winner = false;
    public static String winput;
    public static Scanner Scan = new Scanner(System.in);
    public static void main(String[] args) {
//Deck d = players deck
//Deck d2 = computers deck
        Deck d = new Deck();
        Deck d2 = new Deck(true); 
        d.Shuffle();
        for(int y = 0; y < 26; y++) {
            d2.add(d.draw());
        }
        System.out.println("Welcome to War. Type in d to draw your top card.");
        while(Winner == false) {
        input = Scan.nextLine();
        validinput();
//Finding out the computers card vs the players card
            Card a = d.draw();
            System.out.println("You drew " + a);
            Card b = d2.draw();
            System.out.println("Your opponent drew " + b);
            win(a, b, d, d2);
            winwhole(d, d2);
            System.out.println("Type d to draw your next card.");
        }
    }
//Method checks for the winner of the entire game
    public static void winwhole(Deck d, Deck d2) {
//Finding if there is a winner
        if(d.size == 0 || d2.size == 0) {
//If there is winner then find out if the player lost
            if(d.size == 0) {
                System.out.println("You lose. RIP. Thanks for playing. See you later."); 
                System.exit(0);  
            }
//If there is winner then find out if the player won
            if(d2.size == 0) {
                System.out.println("You win! Nice Job! Thanks for playing. See you later.");
                System.exit(0); 
            }
        }
    }
//Method checks for the winner of this round
    public static int win(Card a, Card b, Deck d, Deck d2) {
//Lose
        if(a.getNumber() < b.getNumber()) {
            System.out.println("You lost this match. RIP :(");
            d2.add(a);
            d2.add(b);
            return 0;
        }
//Win
        if(a.getNumber() > b.getNumber()) {
            System.out.println("You won this match. Nice!");
            d.add(a);
            d.add(b);
            return 1;
        }
//Tie
        if(a.getNumber() == b.getNumber()) {
            System.out.println("You have tied. You are going into war");
            if(d.CardList.size() < 4 || d2.CardList.size() < 4) {
                if(d.CardList.size() < 4) {
                    System.out.println("You lose. RIP. Would you like to play again?");
                     
                }
                if(d2.CardList.size() < 4) {
                    System.out.println("You win! Nice Job! Would you like to play again?");
                    
                }
                winput = Scan.nextLine();
            if(winput.toLowerCase().contains("y") ) {
                System.out.println("Ok then lets go again");
            }
            else {
                System.out.println("Ok thanks for playing. See you later.");
                System.exit(0);
            }
            }
            Card[] wager = {d.draw(), d.draw(), d.draw(), d2.draw(), d2.draw(), d2.draw()};
            if (win(d.draw(), d2.draw(), d, d2)==1){
                for (Card i:wager){
                    d.add(i);
                }
                return 1;
            }
            else if(win(d.draw(), d2.draw(), d, d2)==1){
                for (Card i:wager){
                    d2.add(i);
                }
                return 0;
            }
        }
        return -1;
    }
//Method makes sure they type d to draw there card
//If not then ask them to type d again
    public static void validinput() {
        while (!input.toLowerCase().contains("d")) {
            System.out.println("Please type d to draw your card");
            input = Scan.nextLine();
        } 
    }
}