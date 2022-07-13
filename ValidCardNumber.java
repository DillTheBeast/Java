public class ValidCardNumber {
    public static void main(String[] args) {
        //All valid credit card numbers
        int valid1[] = {4, 5, 3, 9, 6, 7, 7, 9, 0, 8, 0, 1, 6, 8, 0, 8};
        int valid2[] = {5, 5, 3, 5, 7, 6, 6, 7, 6, 8, 7, 5, 1, 4, 3, 9};
        int valid3[] = {3, 7, 1, 6, 1, 2, 0, 1, 9, 9, 8, 5, 2, 3, 6};
        int valid4[] = {6, 0, 1, 1, 1, 4, 4, 3, 4, 0, 6, 8, 2, 9, 0, 5};
        int valid5[] = {4, 5, 3, 9, 4, 0, 4, 9, 6, 7, 8, 6, 9, 6, 6, 6};
        
        // All invalid credit card numbers
        int invalid1[] = {4, 5, 3, 2, 7, 7, 8, 7, 7, 1, 0, 9, 1, 7, 9, 5};
        int invalid2[] = {5, 7, 9, 5, 5, 9, 3, 3, 9, 2, 1, 3, 4, 6, 4, 3};
        int invalid3[] = {3, 7, 5, 7, 9, 6, 0, 8, 4, 4, 5, 9, 9, 1, 4};
        int invalid4[] = {6, 0, 1, 1, 1, 2, 7, 9, 6, 1, 7, 7, 7, 9, 3, 5};
        int invalid5[] = {5, 3, 8, 2, 0, 1, 9, 7, 7, 2, 8, 8, 3, 8, 5, 4};
        
        // Can be either valid or invalid
        int mystery1[] = {3, 4, 4, 8, 0, 1, 9, 6, 8, 3, 0, 5, 4, 1, 4};
        int mystery2[] = {5, 4, 6, 6, 1, 0, 0, 8, 6, 1, 6, 2, 0, 2, 3, 9};
        int mystery3[] = {6, 0, 1, 1, 3, 7, 7, 0, 2, 0, 9, 6, 2, 6, 5, 6, 2, 0, 3};
        int mystery4[] = {4, 9, 2, 9, 8, 7, 7, 1, 6, 9, 2, 1, 7, 0, 9, 3};
        int mystery5[] = {4, 9, 1, 3, 5, 4, 0, 4, 6, 3, 0, 7, 2, 5, 2, 3};
        
        // An array of all the arrays above
         int[][] batch = {valid1, valid2, valid3, valid4, valid5, invalid1, invalid2, invalid3, invalid4, invalid5, mystery1, mystery2, mystery3, mystery4, mystery5};

        //Declaring normal variables
         int odd[] = new int[valid1.length/2];
         int even[] = new int[valid1.length/2];
         int idxo = 0;
         int idxe = 0;
        //Making for loops to split the array into an even and an odd array(First step to finding if the card number is valid)
        for(int o = 0; o < valid1.length-1; o += 2) {
            odd[idxo] = valid1[o];
            idxo++;
        }
        for(int e = 1; e < valid1.length-1; e += 2) {
            even[idxe] = valid1[e];
            idxe++;
        }
        //printArray(even);

    }

    public static void printArray(int[] arr) {
        for(int l = 0; l < arr.length-1; l++) {
            System.out.println(arr[l]);
        }
    }
}
