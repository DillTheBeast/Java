import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        //Variables
        Scanner Scan = new Scanner(System.in);
        String output1;
        String output2;
        char middle;
        int moutput;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        System.out.println("What is the name of your website?");
        String input = Scan.nextLine();

        if(input.length() % 2 == 0) {
            char middle1 = input.charAt(input.length()/2-1);
            char middle2 = input.charAt(input.length()/2);
            System.out.println(middle1);
            System.out.println(middle2);
        }
        else {
            middle = input.charAt(input.length()/2);
            System.out.println(middle);

            for(int i = 0; i < input.length(); i++) {
                if(i > input.length()/2) {
                    sb1.append(input.charAt(i));
                }
                else if(i < input.length()/2) {
                    if(i == input.length()/2+1) {
                        String test = Character.toString(input.charAt(i));
                        //String test1 = ""+test.toUpperCase();
                        sb2.append(test.toUpperCase());
                    }
                    else {
                    sb2.append(input.charAt(i));
                    }
                }
                else {
                    middle = input.charAt(i);
                    if(middle == 'a' || middle == 'b' || middle == 'c') {
                        middle = 1;
                    }
                    else if(middle == 'd' || middle == 'e' || middle == 'f') {
                        middle = 2;
                    }
                    else if(middle == 'g' || middle == 'h' || middle == 'i') {
                        middle = 3;
                    }
                    else if(middle == 'j' || middle == 'k' || middle == 'l') {
                        middle = 4;
                    }
                    else if(middle == 'm' || middle == 'n' || middle == 'o') {
                        middle = 5;
                    }
                    else if(middle == 'p' || middle == 'q' || middle == 'r') {
                        middle = 6;
                    }
                    else if(middle == 's' || middle == 't' || middle == 'u') {
                        middle = 7;
                    }
                    else if(middle == 'v' || middle == 'w' || middle == 'x') {
                        middle = 8;
                    }
                    else if(middle == 'y' || middle == 'z') {
                        middle = 9;
                    }
                }
            }
            output1 = sb1.toString();
            output2 = sb2.toString();
            moutput = middle;
            System.out.println(output1+moutput+output2);
        }
        
    }
}
