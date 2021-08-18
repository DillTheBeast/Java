import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
public class BlackJack {
    public static String input;
    public static boolean Winner = false;
    public static Scanner Scan = new Scanner(System.in);
    public static void main(String[] args) {
        Deck d = new Deck();
        d.Shuffle();
        while(Winner == false) {
            System.out.println("Welcome to Black Jack. Type d to draw your first card.");
            Winner = true;
        }
    }

    public static void bust(Deck d) {

    }
}
