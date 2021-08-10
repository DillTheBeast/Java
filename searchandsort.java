


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

//All for insertionsort method
/*
System.out.println(" ");
        int[] Sort = new int[10];
        for(int d = 0; d < 10; d++) {
            int rnum = f.nextInt(100);
            System.out.print(" ");
            System.out.println(rnum);
            Sort[d] = rnum;
            
        }
        */
        /*
        System.out.println(" ");
        for(int y = 0; y < left.length; y++) {
            int rnum = f.nextInt(100);
            System.out.println(" ");
            System.out.println(rnum);
            left[y] = rnum;
        }
        System.out.println(" ");
        for(int x = 0; x < right.length; x++) {
            int rnum = f.nextInt(100);
            System.out.println(" ");
            System.out.println(rnum);
            right[x] = rnum;
        }
        */
         
        System.out.println(" ");
        int[] array = new int[8];
        for(int d = 0; d < 8; d++) {
            int rnum = f.nextInt(100);
            System.out.print(" ");
            System.out.println(rnum);
            array[d] = rnum;
            
        }

        System.out.println(" ");
        sorted = mergesort(array);
        for(int v = 0; v < sorted.length; v++) {
            System.out.println(sorted[v]);
        }

        //int[] x = insertionsort(Sort);
        //int[] x = selectionsort(Sort);
        /*
        int[] x = mergesortrec(Sort);
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

    public static int[] mergesort(int[] array) {
        int n1 = 0;
        int n2 = 0;
        int n = 0;
        
        int[] left = new int[array.length/2];
        int[] right = new int[array.length - array.length/2];
            
        if(array.length > 1) {
            for(int l = 0; l < left.length; l++) {
                left[l] = array[l];
            }

            for(int r = left.length ; r < array.length; r++) {
                right[r-left.length] = array[r];
            }
            
            left = mergesort(left);
            right = mergesort(right);        
        
            while(true) {

                /*
                System.out.println("\narray: ");
                for(int q = 0; q < array.length; q++) {
                    System.out.print(array[q]+", ");
                }
                System.out.println("\nleft: ");
                for(int m = 0; m < left.length; m++) {
                    System.out.print( left[m]+", ");
                }
                System.out.println("\nright: ");
                for(int k = 0; k < right.length; k++) {
                    System.out.print(right[k]+", ");
                }
                */

                if ((n1 == left.length-1 && n2 == right.length-1) || n == array.length-1) {
                    break;
                }
                if(left[n1] > right[n2] || n1 == left.length-1) {
                    array[n] = right[n2];
                    n++;
                    n2++;
                }
                if(left[n1] < right[n2] || n2 == right.length-1) {
                    array[n] = left[n1];
                    n++;
                    n1++;
                } 
                if(left[n1] == right[n2]) {
                    array[n] = left[n1];
                    n++;
                    n1++;
                }    
            }
        }
        return array;
        
    }

    public static int[] merge(int[] left, int[] right ) {
        int a = 0;
        int b = 0;
        int[] sorted = new int[left.length + right.length];
        while(left.length != a && right.length != b) {
            /*
            for(int j = 0; j < left.length; j++) {
                System.out.println(left[j]);
            }
            for(int k = 0; k < right.length; k++) {
                System.out.println(right[k]);
            }
            */
            if(left[a] > right[b]) {
                sorted[a+b] = right[b];
                b++;
            }
            else if(left[a] == right[b]) {
                sorted[a+b] = left[a];
                sorted[a+b] = right[b];
                a++;
                b++;
            }
            else if(left[a] < right[b]) {
                sorted[a+b] = left[a];
                a++;
                
            }

            for(int s = 0; s < sorted.length; s++) {
                System.out.println("sorted" + sorted[s]);
            }
            System.out.println(" ");

            for(int f = 0; f < left.length; f++) {
                System.out.println("left" + left[f]);
            }
            System.out.println(" ");

            for(int g = 0; g < right.length; g++) {
            System.out.println("right" + right[g]);
            }
            System.out.println(" ");

        }

        for(int r = b; r < right.length; r++) {
            sorted[r+a] = right[r];
        }

        for(int l = a; l < left.length; l++) {
            sorted[l+b] = left[l];
        }

        return sorted;

    }
}