import java.util.Scanner;
public class improvedtictactoe {
//Declaring public variables
    public static int xinput;
        public static int yinput;
        public static boolean xturn = true;
        public static boolean Winner = false;
        public static String current;
    public static void main(String[] args) {
//Declaring variables
            Scanner Scan = new Scanner(System.in);
        String[][] Board = new String[3][3];

resetboard(Board);
//Checks for winner
//If no winner then print out who's turn it is
        while(Winner == false) {
            if(xturn == true) {
                System.out.println("It is X's turn");
            }
            else {
                System.out.println("It is O's turn");
            }
            takeinput(Board);
        } 
    }
//Method takes the input and places the piece if spot is valid
    public static void takeinput(String[][] Board) {
        Scanner Scan = new Scanner(System.in);
        xinput = Scan.nextInt();
        yinput = Scan.nextInt();
        String input;
        validate(Board);
        if(validate(Board) == true) {
            if(xturn == true) {
                placepiece("x ", Board); 
                printboard(Board);
                winner(Board);
                current = "o ";
                xturn = false;
            }
            else {                                                                                                                         
                placepiece("o ", Board);
                printboard(Board);
                winner(Board);
                current = "x ";
                xturn = true;
            }           
        }
        else {
            System.out.println("You cannot go here");
            System.out.println("Please try again");
            takeinput(Board);
        }
//Looping the game
        if(Winner == true) {
            System.out.println("Would you like to play again?");
            Scan.nextLine();
            input = Scan.nextLine();
            if(input.equals ("Yes") || input.equals ("yes")) {
                Winner = false;
                resetboard(Board);     
            }
        }
    }
//Method used in takeinput method
//Makes sure the spot is not already taken, or off of the board
    public static boolean validate(String[][] Board) {
        if(xinput == 0 || xinput == 1 || xinput == 2) {
            if(yinput == 0 || yinput == 1 || yinput == 2) {
                if(Board[xinput][yinput] == "_ ") { 
                    return true;
                }
            }
        }
        return false;
    }
//Method used in takeinput method 
//Helps place the piece down
    public static void placepiece(String piece, String[][] Board) {
        Board[xinput][yinput] = piece;                    
    }
//Method used in main method and in takeinput method
//Used to reset the board after the game ends if the player wants to play again in takeinput method
//Used to print the Board after every move during the game in main method 
    public static void resetboard(String Board[][]) {
//Fills board up with lines to clean the board up
    for(int y = 0; y < Board.length; y++) {
        for(int x = 0; x < Board.length; x++) {
            Board[x][y] = "_ ";      
        }
}
}
//Prints out the actual board
    public static void printboard(String[][] Board) {
        for(int y = 0; y < Board.length; y++) {
            for(int x = 0; x < Board.length; x++) {
                System.out.print(Board[x][y]);   
            }
            System.out.println(" ");
        }
    }
//Method used in takeinput method
//Helps find winner
    public static void winner(String[][] Board) { 
        if(Board[0][2] == current && Board[1][2] == current && Board[2][2] == current) {
            System.out.println(current + "wins");
            Winner = true;
        }
        if(Board[0][1] == current && Board[1][1] == current && Board[2][1] == current) {
            System.out.println(current + "wins");
            Winner = true;
        }
        if(Board[0][0] == current && Board[1][0] == current && Board[2][0] == current) {
            System.out.println(current + "wins");
            Winner = true;
        }
        if(Board[0][0] == current && Board[0][1] == current && Board[0][2] == current) {
            System.out.println(current + "wins");
            Winner = true;
        }
        if(Board[1][0] == current && Board[1][1] == current && Board[1][2] == current) {
            System.out.println(current + "wins");
            Winner = true;
        }
        if(Board[2][0] == current && Board[2][1] == current && Board[2][2] == current) {
            System.out.println(current + "wins");
            Winner = true;
        }
        if(Board[0][0] == current && Board[1][1] == current && Board[2][2] == current) {
            System.out.println(current + "wins");
            Winner = true;
        }
        if(Board[0][2] == current && Board[1][1] == current && Board[2][0] == current) {
            System.out.println(current + "wins");
            Winner = true;
        }
        //Finding out if they tied
        int Boardfull = 0;
        for(int y = 0; y < Board.length; y++) {
            for(int x = 0; x < Board.length; x++) {
                if(Board[x][y] == "x " ||Board[x][y] == "o ") {
                    Boardfull++;
                }
            }
        }
        if(Boardfull == 9) {
            System.out.println(" You guys tied");
            Winner = true;
        }
    }
    
}  