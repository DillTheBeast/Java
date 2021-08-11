


import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class searchandsort {
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);
        Random f = new Random();
        int[] left = new int[4];
        int[] right = new int[4];
        int[] all = new int[8];
        int[] sorted = new int[left.length + right.length];

//All for insertionsort method or selectionsort method
/*
System.out.println(" ");
        int[] Sort = new int[10];
        for(int d = 0; d < 10; d++) {
            int rnum = f.nextInt(100);
            System.out.print(" ");
            System.out.println(rnum);
            Sort[d] = rnum;    
        }
        //int[] x = insertionsort(Sort);
        //int[] x = selectionsort(Sort);
        for(int y = 0; y < Sort.length; y++) {
            System.out.println(x[y]);
        }
        */

//All for binarysearch method
        /*
        System.out.println("Pick a number");
        int n = Scan.nextInt();
        int[] List = {5, 8, 12, 24, 33, 42, 56};
        binarysearch(n, List);
        System.out.println(binarysearch(n, List));
        */
        
//All for merge and mergesort method
        System.out.println("Not sorted");
        int[] array = new int[8];
        for(int d = 0; d < 8; d++) {
            int rnum = f.nextInt(100);
            System.out.print(" ");
            System.out.println(rnum);
            array[d] = rnum;
            }

        System.out.println(" ");
        sorted = mergesort(array);
        System.out.println("Sorted");
        for(int v = 0; v < sorted.length; v++) {
            System.out.println(sorted[v]);
        } 
    }
    
    public static boolean binarysearch(int n, int[] List) {
        for(int x = 0; x < List.length; x++) {
            System.out.println(List[x]);
        }
        if(List.length == 0) {
            return false;
        }
        if(n == List[List.length/2]) {
            //System.out.println("Test3");
            //System.out.println(List[List.length/2]);
            return true;
        }
        if(n < List[List.length/2]) {
            //System.out.println("Test1");
            //System.out.println(List[List.length/2]);
            return binarysearch(n, Arrays.copyOfRange(List, 0, List.length/2));
        }
        if(n > List[List.length/2]) {
            //System.out.println("Test2");
            //System.out.println(List[List.length/2]);
            return binarysearch(n, Arrays.copyOfRange(List, List.length/2+1, List.length));
        }
        return false;

    }
    
    public static int[] insertionsort(int[] Sort) {
        
        for(int z = 0; z < Sort.length; z++) {
            for(int n = z; n > 0; n--) {
                if(Sort[n] < Sort[n-1]) {
                    int temp = Sort[n];
                    Sort[n] = Sort[n-1];
                    Sort[n-1] = temp;
                }
                else break;
            }
        }
        return Sort;
        
    }

    public static int[] selectionsort(int[] Sort) {
        for(int z = 0; z < Sort.length; z++) {
            int temp = z;
            int y = 0;
            for(int n = z; n < Sort.length; n++) {
                
                if(Sort[temp] > Sort[n]) {
                    temp = n;
                }  
            }

            y = Sort[temp];
            Sort[temp] = Sort[z];
            Sort[z] = y;
        }
        return Sort;
    }


    public static int[] merge(int[] left, int[] right ) {
//Variables
        int a = 0;
        int b = 0;
        int c = 0;
        int[] sorted = new int[left.length + right.length];
//For the time that left is more than a and right is more than b
        while(left.length > a && right.length > b) {
//If the right number is less than the left
//Put the right number into sorted and compare the next right number
            if(left[a] > right[b]) {
                sorted[c] = right[b];
                b++;
                c++;
            }
//If the 2 numbers are equal 
//Put both numbers into sorted, one next to the other
            else if(left[a] == right[b]) {
                sorted[c] = left[a];
                c++;
                sorted[c] = right[b];
                a++;
                b++;
                c++;
            }
//If the left number is less than the right
//Put the left number into sorted and compare the next left number
            else if(left[a] < right[b]) {
                sorted[c] = left[a];
                a++;
                c++;
                
            }
        }
//These for loops put the actual numbers into sorted when needed
        for(int r = b; r < right.length; r++) {
            sorted[r+a] = right[r];
        }

        for(int l = a; l < left.length; l++) {
            sorted[l+b] = left[l];
        }

        return sorted;

    }

    public static void printlist(int[] array){
        for (int i:array){
            System.out.print(i + ", ");
        }
        System.out.println(" ");
    }
    public static int[] mergesort(int[] array) {
//Variables
        int[] left = new int[array.length/2];
        int[] right = new int[array.length - (array.length/2)];
//If 8 greater than one do the for loops
        if(array.length > 1) {
            for(int l = 0; l < left.length; l++) {
                left[l] = array[l];
            }

            for(int r = left.length; r < array.length; r++) {
                right[r - left.length] = array[r];
            }
//Calling methods
            left = mergesort(left);
            right = mergesort(right);
            array = merge(left, right);
        }

        


        return array;
        
    }

    
}