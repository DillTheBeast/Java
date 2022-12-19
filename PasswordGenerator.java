import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        //Variables
        Scanner Scan = new Scanner(System.in);

        System.out.println("What is the name of your website?\nPlease make the middle letter, and only the middle letter, capital");
        String input = Scan.nextLine();

        if(input.length() % 2 == 0) {
            char middle1 = input.charAt(input.length()/2-1);
            char middle2 = input.charAt(input.length()/2);
            System.out.println(middle1);
            System.out.println(middle2);
        }
        else {
            char middle = input.charAt(input.length()/2);
            System.out.println(middle);
        }
        
    }
}
