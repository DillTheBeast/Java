import java.util.random.*;

public class SabaacDice {

    public static void main(String[] args) {
        int min1 = -10;
        int max1 = 10;
        int min2 = 0;
        int max2 = 3;
        String shape;
        int number = (int)Math.floor(Math.random()*(max1-min1+1)+min1);
        int shapeNumber = (int)Math.floor(Math.random()*(max2-min2+1)+min2);

        if(shapeNumber == 1) {
            System.out.println("triangle");
        }
        else if(shapeNumber == 2) {
            System.out.println("circle");
        }
        else if(shapeNumber == 3) {
            System.out.println("square");
        }

        System.out.println(number);
    }
}
