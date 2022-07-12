//Importing the needed materials
import java.util.Scanner;

class Hangman {
  public static void main(String[] args) {
//Declaring variables
    Scanner Scan = new Scanner(System.in);
    String input;
    String word = "bird";
    int x = 0;
    String[] holder = new String[word.length()];
    int idx;
//Introducing the game and making the first board
    System.out.println("Let's play a game of hangman. I am thinking of a word and       you have to guess the letters. If you guess a wrong letter than you get and X.      If you get 5 X's then you lose.");
    
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
      input = Scan.nextLine();
      idx = word.indexOf(input);
      if(idx == -1) {
        System.out.println("Wrong guess. That is one x for you.");
        x++;
      }
      else if(idx >= 0) {
        holder[idx] = input + " ";
      }
      
      
    }

    

  }
}