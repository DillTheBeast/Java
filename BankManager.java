import java.util.Scanner;

public class BankManager {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Bank Manager. Please enter what you want to do: \n1: Log in \n2:Sign up \n3: Exit");
        boolean isScreen1Complete = false;

        while(isScreen1Complete == false) {
            String choiceinput = scan.nextLine();
            if(choiceinput.equals("1")) {
                login(scan);
                isScreen1Complete = true;
            }
            else if(choiceinput.equals("2")) {
                signUp(scan);
                isScreen1Complete = true;
            }
            else if(choiceinput.equals("3")) {
                System.out.println("Alright see ya");
                System.exit(1);
            }
            else {
                System.out.println("That is not an option please try again");
            }
        }
    }

    public static void login(Scanner scan) {
        System.out.println("Please enter your username");
        String usInput = scan.nextLine();
        System.out.println("Please enter your password");
        String pswdInput = scan.nextLine();
    }
    public static void signUp(Scanner scan) {
        System.out.println("Please enter your username");
        String newUsInput = scan.nextLine();
        //Need to make sure that this username is not taken
        System.out.println("alright " + newUsInput);
        System.out.println("Please enter your password");
        String newPswdInput = scan.nextLine();
        System.out.println("Please enter your full name");
        String newNameInput = scan.nextLine();
    }
}
