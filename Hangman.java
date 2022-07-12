//Importing the needed materials
import java.util.Scanner;

class Hangman {
  public static void main(String[] args) {
//Declaring variables
    Scanner Scan = new Scanner(System.in);
    String word = "hello";
    int ogLength = word.length();
    String ogWord = word;
    int x = 0;
    int l = 0;
    int w = 0;
    String[] holder = new String[ogWord.length()];
    int idx;
//Introducing the game and making the first board
    System.out.println("Let's play a game of hangman. I am thinking of a word and you have to guess the letters. If you guess a wrong letter than you get and X. If you get 5 X's then you lose.");
    
    for(int h = 0; h < holder.length; h++) {
      holder[h] = "_ ";
    }
    System.out.println("");
    System.out.println("Here is the board. The word is a 4 letter word.");
    
    while(x < 5) {
      for(int g = 0; g < holder.length; g++) {
        System.out.print(holder[g]);
      }
      System.out.println("");
      System.out.println("Guess any letter that you would like");
      String input = Scan.nextLine();
      idx = word.indexOf(input);

      if(idx == -1|| input == " ") {
        System.out.println("Wrong guess. That is one X for you.");
        x++;
        l++;
        System.out.println("Your X counter is at " + x);
      }
      else if(idx >= 0) {
          while(idx >= 0) {
        System.out.println("You got a letter right nice.");
        holder[idx] = input + " ";
        word = word.substring(0, idx) + " " + word.substring(idx + 1);
        idx = word.indexOf(input);
        w++;
          }
      }
      if(w == ogLength) {
        System.out.println("You won. Nice Job. The word was " + ogWord);
        break;
      }
    }
    if(l == 5) {
    System.out.println("You lost. L + RATIO Bozo.");
    }


    

  }
}