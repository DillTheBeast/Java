import java.util.Scanner;

public class Hanoi {
    public static int input;
        public static void main(String[] args) {
//Declares and asks for input
            Scanner Scan = new Scanner(System.in);
            System.out.println("How many disks do you have?");
            int n = Scan.nextInt();
//referencing move method in main
            move(n, 1, 2, 3);
        }
//Used for 
        public static void move(int n, int s, int m, int d) {
            if(n == 0)  
                return;
            if(n == 1) {
                System.out.println("Move disk " + n + " from " + s + " to " + d);
                return;
            }
            move(n-1, s, d, m);
            System.out.println("Move disk " + n + " from " + s + " to " + d);
            move(n-1, m, s, d);
        }
}
