import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Palindrome {
    public static void main(String[] args) {
//Declaring Variables
        Scanner Scan = new Scanner(System.in);
        String input;
        String input2 = "";
        int idx;

        System.out.println("Give me a word and I will test if it spells the same thing backwards");
        input = Scan.nextLine();
        for(int l = input.length() - 1; l >= 0; l--) {
            input2 += input.charAt(l);
        }
//Finding out if input is the same thing as the backwards input
//Finding out if input is not the same thing as the backwards input

        if(input .equals(input2)) {
            System.out.println(input + " backwords is " + input2);
            System.out.println("This means that " + input + " is a palindrome");
        }
        else {
            System.out.println(input + " backwords is " + input2);
            System.out.println("This means that " + input + " is not a palindrome");
        }

    }
}
