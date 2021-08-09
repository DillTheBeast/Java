import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
//Declaring variables
        Scanner Scan = new Scanner(System.in);
        String input;
        boolean chose = false;
//Asking for what they want to do
        System.out.println("What operation would you like to do?");

//Finding out what they chose 
        while(chose == false) {
        input = Scan.nextLine();
//Asking what numbers they want to use with whatever operation they chose
            if(input.equals ("Addition")) {
                System.out.println("Which two numbers would you like to add?");
            int intinput1 = Scan.nextInt();
            int intinput2 = Scan.nextInt();
            System.out.println(addition(intinput1,intinput2));
            chose = true;
            }
            else if(input.equals ("Subtraction")) {
                System.out.println("Which two numbers would you like to subtract?");
                int intinput1 = Scan.nextInt();
                int intinput2 = Scan.nextInt();
                System.out.println(subtraction(intinput1,intinput2));
                chose = true;;
            }
            else if(input.equals ("Multiplication")) {
                System.out.println("Which two numbers would you like to multiply?");
                int intinput1 = Scan.nextInt();
                int intinput2 = Scan.nextInt();
                System.out.println(multiply(intinput1,intinput2));
                chose = true;
            }
            else if(input.equals ("Division")) {
                System.out.println("Which two numbers would you like to divide?");
                int intinput1 = Scan.nextInt();
                int intinput2 = Scan.nextInt();
                System.out.println(division(intinput1,intinput2));
                chose = true;
            
            }
            else {
                System.out.println("You cannot choose that");
                System.out.println("The only options are Addtiion, Subtraction, Multiplication, or Division");
            }
        }

    }
//Making each method for each operation
    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static int division(int num1, int num2) {
        return num1 / num2;
    }
}
    

