import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
    
//  Square
/*
    for (int y = 0; y < 5; y++) {
        for(int x = 0; x < 5; x++) {
            System.out.print("x ");
        }
         System.out.println(" ");
    }
*/

//  Triangle
/*
    for (int y = 0; y < 5; y++) {
        for(int x = 0; x < y + 1;x++ ) {
            System.out.print("x ");
        }
        System.out.println(" ");
    }
*/

//Triangle the other way
/* 
    for (int y = 0; y < 5; y++) {
        for(int x = 5; x > y ;x-- ) {
            System.out.print("  ");
        }
        for(int z = 0; z < y + 1;z++ ) {
            System.out.print("x ");
        }
    System.out.println(" ");
    }
*/

//  Upside down triangle
/*
    for (int y = 0; y < 5; y++) {
        for(int x = 5; x > y ;x--) {
            System.out.print("x ");
        }
        System.out.println(" ");
    }
*/

//Equilateral Triangle
///*
    for (int y = 0; y < 5; y++) {
        for(int x = 5; x > y ;x-- ) {
            System.out.print(" ");
        }
        for(int z = 0; z < y + 1;z++ ) {
            System.out.print("x ");
        }
    System.out.println(" ");
    }
//*/

//Diamond
/*
for (int y = 0; y < 5; y++) {
    for(int x = 5; x > y ;x-- ) {
        System.out.print(" ");
    }
    for(int z = 0; z < y + 1;z++ ) {
        System.out.print("x ");
    }
    System.out.println(" ");
}
for (int y = 0; y < 5; y++) {
    for(int x = 0; x < y + 1;x++ ) {
        System.out.print(" ");
    }
    for(int z = 5; z > y ;z-- ) {
        System.out.print("x ");
    }
    System.out.println(" ");
}
*/

//Diamond asking you how many blocks you want it
/*
Scanner Scan = new Scanner(System.in);
System.out.println("How big do you want to make the diamond?");
int input;
input = Scan.nextInt();
for (int y = 0; y < input; y++) {
    for(int x = input; x > y ;x-- ) {
        System.out.print(" ");
    }
    for(int z = 0; z < y + 1;z++ ) {
        System.out.print("x ");
    }
    System.out.println(" ");
}
for (int y = 0; y < input; y++) {
    for(int x = 0; x < y + 1;x++ ) {
        System.out.print(" ");
    }
    for(int z = input; z > y ;z-- ) {
        System.out.print("x ");
    }
    System.out.println(" ");
}
*/

//Hollow Diamond asking how many blocks you want it
/*
Scanner Scan = new Scanner(System.in);
System.out.println("How big do you want to make the diamond?");
int input;
input = Scan.nextInt();
for (int y = 0; y < input; y++) {
    for(int x = input; x > y ;x-- ) {
        System.out.print(" ");
    }
    for(int z = 0; z < y + 1;z++ ) {
        if(z == 0 || z == y) {
            System.out.print("x ");
        }
        else {
            System.out.print("  ");
        }
    }
    System.out.println(" ");
}
for (int y = 0; y < input; y++) {
    for(int x = 0; x < y + 1;x++ ) {
        System.out.print(" ");
    }
    for(int z = input; z > y ;z-- ) {
        if(z == input || z == y + 1) {
            System.out.print("x ");
        }
        else {
            System.out.print("  ");
        }
    }
    System.out.println(" ");
}
*/

    }
}
