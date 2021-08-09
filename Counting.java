import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
//For counting method
        counting(Scan.nextInt(), Scan.nextInt());
//For factorial method
        //int x = factorial(Scan.nextInt());
        //System.out.println(x);
//For exponent method
        //int a = exponent(Scan.nextInt(), Scan.nextInt());
        //System.out.println(a);
//For fsequence method
        //int f = fsequence(Scan.nextInt());
        //System.out.println(f);
    }
//Counts from one number you put in to the other number that you put in

    public static void counting(int i, int x) {
        System.out.println(i);
            if(i != x) {
                counting(i+1, x);
            }
    }

//Gets the factorial of a number

    public static int factorial(int y) {
        int x = y-1;
        if(y == 0) {
            return 1;
        }
        return y*factorial(x);
    }

//Gets one number as the base and another number for the exponent to find the answer
    public static int exponent(int a, int b) {
        if(b == 0) {
            return 1;
        }
        return a*exponent(a, b-1);
    }

//Gets the fibonacci sequence of a number
//Fibonacci sequence mean you add the last 2 numbers and that is the answer
//Example: 0, 1, 1, 2, 3, 5, 8, 13, 21
    public static int fsequence(int z) {
        if(z == 1 || z == 2) 
            return z-1;
        
        return fsequence(z-1) + fsequence(z-2);

    }   


}
