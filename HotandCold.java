//Importing what is needed
import java.util.Scanner;
import java.util.Random;

class HotandCold {
  public static void main(String[] args) {
    // Declaring Variables
    Scanner Scan = new Scanner(System.in);
    int rnum;
    int input;
    int max = 100;
    int min = 1;
    // Introducing the game
    System.out.println("Alright let's play the game hot and cold.");
    System.out.println("I have thought of a number now you guess it. It is between 1 and 100");
    // Generating the random number
    rnum = (int) (Math.random() * (max - min) + 1) + min;
    // Making sure this only runs until the number has been guessed
    while(true) {
      input = Scan.nextInt();
      // Making sure that the number is between 1 and 100
      if (input <= max || input >= min) {
        // Checking if the player has guessed the number
        //If the number has not been guessed then it tells them how close they are to guessing it
        if (rnum == input) {
          System.out.println("Good job you have guessed the number");
          break;
        }
        
       else if (Math.abs(input - rnum) >= 20) {
          System.out.println("You are cold. Try a different number.");
        }
       else if (Math.abs(input - rnum) >= 10) {
          System.out.println("You are hot but still off by a little. Try a new number.");
        }
       else if (Math.abs(input - rnum) >= 5) {
          System.out.println("You are scorching hot. Try a new number that is very close to the previous guess.");
        }
        else if (Math.abs(input - rnum) <= 5) {
          System.out.println("You are scorching hot. Try a new number that is very close to the previous guess.");
        }
      }
      // If the number is not valid then telling them that they can't choose that number
      else {
        System.out.println("You can't put this number in. It has to be between 1 and 100.");
      }

    }
  }
}
