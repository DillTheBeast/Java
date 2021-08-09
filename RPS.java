import java.util.Scanner;
import java.util.Random;

public class RPS {
  public static void main(String[] args) {
      
      boolean chose = false;
      Scanner Scan = new Scanner(System.in);
      int rnum;
      String input = "error";
      while(true) {

     System.out.println ("Let's play a game!");
     System.out.println ("Rock, Paper, or Scissors?");

     while(chose == false) {
       input = Scan.nextLine();

       if(input.equals("Rock") || input.equals("Paper") || input.equals("Scissors"))  {
    chose = true;
       }  else {
         System.out.println("The only options are Rock, Paper, Scissors");
       }
     }
     chose = false;  
  rnum = (int)(Math.random()*(3-1)+ 1);

   System.out.println ("You chose " + input);
     System.out.println ("Okay. Rock, Paper, Scissors says shoot!!!");
  
  if(rnum == 1) {
    System.out.println ("I chose Rock.");
  }

  if(rnum == 2) {
    System.out.println ("I chose Paper.");
  }

  if(rnum == 3) {
    System.out.println ("I chose Scissors.");
    }
  
  if(input.equals("Rock")) {
    if(rnum == 1) {
      System.out.println ("You tied");
    }
    if(rnum == 2) {
      System.out.println ("You lose. RIP");
    }
    if(rnum == 3) {
      System.out.println ("You win!!");
    }
  }
 
 if(input.equals("Paper")) {
    if(rnum == 1) {
      System.out.println ("You win!!");
    }
    if(rnum == 2) {
      System.out.println ("You tied");
    }
    if(rnum == 3) {
      System.out.println ("You lose. RIP");
    }
  }

if(input.equals ("Scissors")) {
    if(rnum == 1) {
      System.out.println ("You lose. RIP");
    }
    if(rnum == 2) {
      System.out.println ("You win");
    }
    if(rnum == 3) {
      System.out.println ("You tied");
    }
  }
    System.out.println ("");
      }
    }
  }