import java.util.Scanner;
public class improvedcalculator {
    public static void main(String[] args) {
//Declaring vairables
        Scanner Scan = new Scanner(System.in);
        String input;
        int intinput1;
        int intinput2;
        boolean chose = false;
//Asking for what operation they want to do
        System.out.println("Put in a for addition, s for subtraction, m for multiplication, and d for division");
        input = Scan.nextLine();
//Finding out if they put a valid operation. If they did then move on
        while(chose == false) {
            if(input.equals ("a") || input.equals ("s") || input.equals ("m") || input.equals ("d")) {
                chose = true;
            }
            else {
                System.out.println("The only options are a, s, m, or d");
            input = Scan.nextLine();
            }   
        }
//Asking and finding out what number they put in so we can solve the math problem. Also, importing the math method into the main method
        System.out.println("Put in 2 numbers");
        intinput1 = Scan.nextInt();
        intinput2 = Scan.nextInt();
        System.out.println(math(intinput1, intinput2, input));
    }
//Making method for actual operations
    public static int math(int num1, int num2, String type) {
        if(type.equals ("a")) {
            return num1 + num2;
        }
        if(type.equals ("s")) {
            return num1 - num2;
        }
        if(type.equals ("m")) {
            return num1 * num2;
        }
        if(type.equals ("d")) {
            return num1 / num2;
        }
        return -1;
    }
    
    
}
