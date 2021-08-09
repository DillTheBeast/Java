import java.util.Scanner;
public class Connect4 {
//Declaring Variables
//Y = Yellow
//R = Red
    public static String current = "y ";
    public static int xinput;
    public static boolean Winner = false;
    public static boolean yturn = true;
    public static String piece;
    public static String[][] Board = new String[7][6];
    public static boolean validate = false;
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        resetboard();
//Finding who's turn it is and printing it out after making sure there is no winner
        while(Winner == false) {
            if(yturn == true) {
            System.out.println("It is Yellow's turn:");
            takeinput(Board);
            }
            else {
            System.out.println("It is Red's turn:");
            takeinput(Board);
            }
        }
    }
//Method takes the input and places the piece if spot is valid
public static void takeinput(String[][] Board) {
    Scanner Scan = new Scanner(System.in);
    xinput = Scan.nextInt();
    String input;
    validation();
//If spot is ok run this if statement
    if(validation() == true) {
//If it is yellow's turn run this if statement
        if(yturn == true) { 
            gravity(xinput);
            printboard(Board);
            win();
            tie();
            current = "r ";
            yturn = false;
        }
//If it is red's turn run this else statement
        else {   
            gravity(xinput);                                                                                                                       
            printboard(Board);
            win();
            tie();
            current = "y ";
            yturn = true;
        } 
    }
//If spot is not ok run this else statement
    else {
        System.out.println("This column is already full. Please try a different one");
        takeinput(Board);
    }          
//Looping the game
    if(Winner == true) {
        System.out.println("Would you like to play again?");
        Scan.nextLine();
        input = Scan.nextLine();
        if(input.equals ("Yes") || input.equals ("yes")) {
            Winner = false; 
            yturn = true;
            current = "y ";
            resetboard();
        }
        else if(input != "No" || input != "no") {
            System.out.println("This is not a valid answer. Please answer with a yes or no ");
            Scan.nextLine();
        }
    }
}
//Method used in main method and in takeinput method
//Used to reset the board after the game ends if the player wants to play again in takeinput method
//Used to print the Board after every move during the game in main method 
public static void resetboard() {
    //Filling up board with lines 
    for(int x = 0; x < 7; x++) {
        for(int y = 0; y < 6; y++) {
            Board[x][y] = "_ ";
        }
    }
}
    //Used in takeinput method
//Prints out the board
    public static void printboard(String[][] Board) {
        for(int y = 0; y < 6; y++) {
            for(int x = 0; x < 7; x++) {
                System.out.print(Board[x][y]);   
            }
            System.out.println(" ");
        }
    }
//Used in takeinput method
//Makes sure that this column is not already full
    public static boolean validation() {
        if(Board[xinput][0] != "_ ") {
            return false;
        }
        return true;
    }
//Used in takeinput method 
//Makes the pieces fall down into the lowest spot underneath them
    public static void gravity(int x) {
        int y = 0;
        Scanner Scan = new Scanner(System.in);
        for(y = 0; y < 5; y++) {
            if(Board[xinput][y+1] != "_ ") {
                if(yturn == true) {
                    Board[xinput][y] = "y ";
                }
                else {
                    Board[xinput][y] = "r ";
                    }
                    break;
                }
            }
        if(yturn == true) {
            if(Board[xinput][5] == "_ ") {
            Board[xinput][5] = "y ";
            }
        }
        else {
            if(Board[xinput][5] == "_ ") {
                Board[xinput][5] = "r ";
                } 
        }
    }
//Used in takeinput method
//Checks for a winner
    public static void win() {
//These for loops and if statement check for a horizontal winner
        for(int x = 0; x < 4; x++) {
            for(int y = 0; y < 6; y++) {
                if(Board[x][y] == current && Board[x+1][y] == current && Board[x+2][y] == current && Board[x+3][y] == current) {
                    System.out.println(current + "wins");
                    Winner = true;
                }
            }
        }
//These for loops and if statement check for a vertical winnner
        for(int x = 0; x < 7; x++) {
            for(int y = 0; y < 3; y++) {
                if(Board[x][y] == current && Board[x][y+1] == current && Board[x][y+2] == current && Board[x][y+3] == current) {
                    System.out.println(current + "wins");
                    Winner = true;
                }
            }
        }
//These for loops and if statement checkk for a diagonal winner
        for(int x = 0; x < 4; x++) {
            for(int y = 0; y < 3; y++) {
                if(Board[x][y] == current && Board[x+1][y+1] == current && Board[x+2][y+2] == current && Board[x+3][y+3] == current) {
                    System.out.println(current + "wins");
                    Winner = true;
                }
                else if(Board[x+3][y] == current && Board[x+2][y+1] == current && Board[x+1][y+2] == current && Board[x][y+3] == current) {
                    System.out.println(current + "wins");
                    Winner = true;
                }
            }
        }
    }
//Used in takeinput method
//Checks to see if there is a tie
    public static void tie() {
        int Full = 0;
        for(int x = 0; x < 7; x++) {
            for(int y = 0; y < 6; y++) {
                if(Board[x][y] != "_ ") {
                    Full++;
                }
            }
        }
        if(Full == 42) {
            System.out.println("You guys tied");
            Winner = true;
        }
    }
}
