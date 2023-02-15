import java.io.IOException;
import java.security.Key;
import java.util.Scanner;

public class GameTest{
    public static void main(String[] args) {
        
        /*
        int i = 0;
        boolean stop = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("X");
        while(stop == false) {
            String input = scan.nextLine();

            if(input.equals("e")) {
                for(int y = 0; y < i; y++) {
                    System.out.print(" ");
                }
                System.out.println(" XX");
                i++;
            }
        }
        */
        char inChar;
        System.out.println("Enter a Character:");
        try {
            inChar = (char) System.in.read();
            System.out.print("You entered ");
            System.out.println(inChar);
        }
        catch (IOException e){
            System.out.println("Error reading from user");
        }
    }
}
