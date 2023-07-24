import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        //Declares all variables
        Scanner Scan = new Scanner(System.in);
        String[][] Board = new String[3][3];
        Boolean Winner = false;
        Boolean xturn = true;

//Makes the board print out lines to make it more cleaned up 
        for(int y = 0; y < Board.length; y++) {
            for(int x = 0; x < Board.length; x++) {
                Board[x][y] = "_ ";      
            }
        }
        //Next part checks for winner
        while(Winner == false) {
            if(xturn == true) {
                System.out.println("It is X's turn");
            }
            else {
                System.out.println("It is O's turn");
            }
            int xinput = Scan.nextInt();
            int yinput = Scan.nextInt();
            //Next part checks for who's turn it is
            boolean com = true;
            while(com == true) {
    
                if(xturn == true && Board[xinput][yinput] == "_ ") {
                    Board[xinput][yinput] = "x ";
                    com = false;
                }
                else if(xturn == false && Board[xinput][yinput] == "_ ") {
                    Board[xinput][yinput] = "o ";
                    com = false;
                }
                else {
                    System.out.println("This spot is already taken");
                    if(xturn == true) {
                        xturn = false;
                    }
                    else {
                        xturn = true;
                    }
                    com = false;
                }
    
            }
            
                    //Making the board
                    for(int y = 0; y < Board.length; y++) {
                        for(int x = 0; x < Board.length; x++) {
                            System.out.print(Board[x][y]);
                        }
                        System.out.println(" ");
                    }
                    //Seeing who's turn it is
                    String current;
                    if(xturn == true) {
                        current = "x ";
                        xturn = false;
                    }
                    else {
                        current = "o ";
                        xturn = true; 
                    }
                    System.out.println();
                    //Finding Winner
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
}