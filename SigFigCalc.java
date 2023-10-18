import java.util.Scanner;
import java.math.BigDecimal;

public class SigFigCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        BigDecimal start = BigDecimal.ZERO;
        int round = 0;

        System.out.println("Would you like to do Sig Fig or Sci Not \nPress 1 or 2");
        int choice = scan.nextInt();
        if(choice == 1) {
            while(!valid) {
                System.out.println("Enter the number");
                start = scan.nextBigDecimal();
                System.out.println("How many digits would you like to round it to");
                round = scan.nextInt();
                if(String.valueOf(start).length() >= round)
                    valid = true;
                else
                    System.out.println("Not possible please redo");

            }
            String end = SigFig(start, round);
            System.out.println(end);
        } else if(choice == 2) {
            System.out.println("Enter the number");
            start = scan.nextBigDecimal();
            String end = SciNot(start);
            System.out.println(end);
        }
    }
    public static String SigFig(BigDecimal num, int round) {
        String numString = String.valueOf(num);
        String finalNum = "";
        int sizeCount = 0;
        boolean first = true;
        
        for(int i = 0; i < numString.length(); i++) {
            char currentChar = numString.charAt(i);

            if((currentChar == '0' || currentChar == '.') && first) {
                finalNum += currentChar;
            } else if(currentChar == '.') {
                finalNum += currentChar;
            } else {
                if (sizeCount == round - 1) {
                    if (i < numString.length() - 1 && Character.getNumericValue(numString.charAt(i + 1)) >= 5) {
                        int place = Character.getNumericValue(currentChar);
                        place++;
                        finalNum += String.valueOf(place);
                    } else {
                        finalNum += currentChar;
                    }
                    return finalNum;
                }
                first = false;
                finalNum += currentChar;
                sizeCount++;
            }
        }
        return finalNum;
    }
    public static String SciNot(BigDecimal num) {
        String numString = String.valueOf(num);
        String finalNum = "";
        int sizeCount = 0;
        if(numString.charAt(0) == '0') {
            //Need to be negative power
            if(numString.charAt(1) == '.') {
                for(int i = 2; i < numString.length(); i++) {
                    if(numString.charAt(i) != 0)
                        sizeCount++;
            }
            }
        } else if(numString.charAt(0) == '.') {
            //Need to be negative power
        } else {
            //Need to be positive power
        }
    }

}