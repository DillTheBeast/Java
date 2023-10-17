import java.util.Scanner;
public class SigFigCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        double start = 0.0;
        int round = 0;

        System.out.println("Would you like to do Sig Fig or Sci Not \nPress 1 or 2");
        int choice = scan.nextInt();
        if(choice == 1) {
            while(valid) {
                System.out.println("Enter the number");
                start = scan.nextDouble();
                System.out.println("How many digits would you like to round it to");
                round = scan.nextInt();
                if(String.valueOf(start).length() >= round)
                    valid = true;
                else
                    System.out.println("Not possible please redo");

            }
            double end = SigFig(start, round);
        } else if(choice == 2) {

        }
    }
    public static double SigFig(double num, int round) {
        //Need to find the amount of sig figs in the problem. 
        String numString = String.valueOf(num);
        boolean first = true;
        for(int i = 0; i < num; i++) {
            if((numString.charAt(i) != '0' || numString.charAt(i) != '.') && first == true) {

            } else if(numString.charAt(i) == '.' && first == true) {

            }
            else {
                first = false;
            }
        }
    }
}
