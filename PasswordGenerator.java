import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        //Variables
        Scanner Scan = new Scanner(System.in);
        String output1;
        String output2;
        char middle;
        char middle1;
        char middle2;
        char mholder1;
        char mholder2;
        int moutput;
        int moutput1;
        int moutput2;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        System.out.println("What is the name of your website?");
        String input = Scan.nextLine();

        if(input.length() % 2 == 0) {
            middle1 = input.charAt(input.length()/2-1);
            middle2 = input.charAt(input.length()/2);

            for(int l = 0; l < input.length(); l++) {
                if(l == input.length()/2-1 || l == input.length()/2) {
                    middle = input.charAt(l);

                    if(middle2 == 'a' || middle2 == 'b' || middle2 == 'c') {
                        middle2 = 1;
                    }
                    else if(middle2 == 'd' || middle2 == 'e' || middle2 == 'f') {
                        middle2 = 2;
                    }
                    else if(middle2 == 'g' || middle2 == 'h' || middle2 == 'i') {
                        middle2 = 3;
                    }
                    else if(middle2 == 'j' || middle2 == 'k' || middle2 == 'l') {
                        middle2 = 4;
                    }
                    else if(middle2 == 'm' || middle2 == 'n' || middle2 == 'o') {
                        middle2 = 5;
                    }
                    else if(middle2 == 'p' || middle2 == 'q' || middle2 == 'r') {
                        middle2 = 6;
                    }
                    else if(middle2 == 's' || middle2 == 't' || middle2 == 'u') {
                        middle2 = 7;
                    }
                    else if(middle2 == 'v' || middle2 == 'w' || middle2 == 'x') {
                        middle = 8;
                    }
                    else if(middle2 == 'y' || middle2 == 'z') {
                        middle2 = 9;
                    }

                    else if(middle1 == 'a' || middle1 == 'b' || middle1 == 'c') {
                        middle1 = 1;
                    }
                    else if(middle1 == 'd' || middle1 == 'e' || middle1 == 'f') {
                        middle1 = 2;
                    }
                    else if(middle1 == 'g' || middle1 == 'h' || middle1 == 'i') {
                        middle = 3;
                    }
                    else if(middle1 == 'j' || middle1 == 'k' || middle1 == 'l') {
                        middle1 = 4;
                    }
                    else if(middle1 == 'm' || middle1 == 'n' || middle1 == 'o') {
                        middle = 5;
                    }
                    else if(middle1 == 'p' || middle1 == 'q' || middle1 == 'r') {
                        middle = 6;
                    }
                    else if(middle1 == 's' || middle1 == 't' || middle1 == 'u') {
                        middle1 = 7;
                    }
                    else if(middle1 == 'v' || middle1 == 'w' || middle1 == 'x') {
                        middle1 = 8;
                    }
                    else if(middle1 == 'y' || middle1 == 'z') {
                        middle1 = 9;
                    }

                }
                else {
                    sb1.append(input.charAt(l));
                }
            }

            output1 = sb1.toString();
            output2 = sb2.toString();
            moutput1 = middle1;
            moutput2 = middle2;
            System.out.println(output1+moutput1+moutput2+output2);
        }
        else {
            middle = input.charAt(input.length()/2);

            for(int i = 0; i < input.length(); i++) {
                if(i > input.length()/2-1) {
                    sb1.append(input.charAt(i));
                }
                else if(i < input.length()/2) {
                    sb2.append(input.charAt(i));
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
