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
//This loop runs until the player wins or loses
    while(x < 5) {
//Prints out the board again
      for(int g = 0; g < holder.length; g++) {
        System.out.print(holder[g]);
      }
//Having the player guess the letter and locating the index number on that letter
      System.out.println("");
      System.out.println("Guess any letter that you would like");
      String input = Scan.nextLine();
      idx = word.indexOf(input);
//Finding out if the letter is wrong and if so giving the player an X
      if(idx == -1|| input == " ") {
        System.out.println("Wrong guess. That is one X for you.");
        x++;
        l++;
        System.out.println("Your X counter is at " + x);
      }
//Finding out if the player got the letter right and if so adding it to the board and removing it from the index so that they can't repeat the same number twice
//While loop is to check if there is more than one of the letter guessed in the word. It runs until the index returns as -1 which is not the index of a right letter in the secret word
      else if(idx >= 0) {
        while(idx >= 0) {
          System.out.println("You got a letter right nice.");
          holder[idx] = input + " ";
          word = word.substring(0, idx) + " " + word.substring(idx + 1);
          idx = word.indexOf(input);
          w++;
        }
      }
//Finding out if the player won
      if(w == ogLength) {
        System.out.println("You won. Nice Job. The word was " + ogWord);
        break;
      }
    }
//Finding out if the player lost
    if(l == 5) {
    System.out.println("You lost. L + RATIO Bozo.");
    }
  }
}