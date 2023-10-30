public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Change this to the number for which you want to find the factorial
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return n * calculateFactorial(n - 1); // Recursive case: n! = n * (n-1)!
        }
    }
}
