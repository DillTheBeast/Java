import java.util.Scanner;
public class War {
    public static String input;
    public static boolean Winner = false;
    public static String winput;
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Deck d = new Deck();
        Deck d2 = new Deck(true);
        d.Shuffle();
        for(int y = 0; y < 26; y++) {
            d2.add(d.draw());
        }
        System.out.println("Welcome to War. Type in d to draw your top card.");
        while(Winner == false) {
        input = Scan.nextLine();
            while (!input.toLowerCase().contains("d")) {
                System.out.println("Please type d to draw your card");
                input = Scan.nextLine();
        }    
        Card a = d.draw();
        System.out.println("You drew " + a);
        Card b = d2.draw();
        System.out.println("Your opponent drew " + b);
        if(d.number < d2.number) {

        }
        }
    }
    public static void wingame(Deck d) {
        Scanner Scan = new Scanner(System.in);
        if(d.size == 0 || d.size == 52) {
            if(d.size == 0) {
                System.out.println("You lose. RIP. Would you like to play again?");
            }
            if(d.size == 52) {
                System.out.println("You win! Nice Job! Would you like to play again?");
            }
            
            winput = Scan.nextLine();
            if(winput.toLowerCase() == "yes") {
                System.out.println("Ok then lets go again");
            }
            else {
                System.out.println("Ok thanks for playing. See you later.");
                Winner = true;
            }
        }
    }
}
