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
        //Calling the method with all of the steps
         validCard(mystery3);
    }

        //Method to print out the arrays if needed for testing
    public static void printArray(int[] arr) {
        for(int l = 0; l < arr.length-1; l++) {
            System.out.println(arr[l]);
        }
    }
        //This method basically has all of the steps in it
    public static boolean validCard(int[] card) {
        //Declaring all of the needed variables
      
        int odd[];
        int even[];
        int idxo = 0;
        int idxe = 0;
        int lastDigit, firstDigit, divisor;;
        int totalDigits = 2;
        int sum = 0;
        int totalodd = 0;
        int totaleven = 0;
        int total = 0;
        int end = 0;


        if(card.length%2 == 0) {
             odd = new int[card.length/2+1];
             even= new int[card.length/2+1];
        }
        else {
             odd = new int[card.length/2+2];
             even = new int[card.length/2+1];
        }

        //Going through and seperating the numbers into two arrays
        //The odd is every other number startign at the first number
        //System.out.println("odd");
        for(int o = 0; o <= card.length-1; o += 2) {   
                odd[idxo] = card[o];
                idxo++;
        }

        //The even is every other number starting at the second number
        for(int e = 1; e <= card.length-2; e += 2) {
                even[idxe] = card[e];
                idxe++;
        }
        /*
        System.out.println("odd");
        printArray(odd);
        System.out.println("even");
        printArray(even);
        //System.exit(1);
        */

        //Doubling the odd set of numbers
        for(int d = 0; d < odd.length; d++) {
            odd[d] = odd[d]*2;
        }

        //Adding the first and last digits of the double digit numbers
        for(int l = 0; l < odd.length; l++) {
            if(odd[l] >= 10) {
                lastDigit = odd[l]%10;
                divisor = (int)Math.pow(10, totalDigits-1);
                firstDigit = odd[l] / divisor;
                sum = firstDigit + lastDigit;
                odd[l] = sum;
            }
        }

        //Adding together all of the numbers in each array
        for(int s = 0; s < odd.length; s++) {
            totalodd = totalodd + odd[s];
        }
        for(int ss = 0; ss < even.length; ss++) {
            totaleven = totaleven + even[ss];
        }

        //Adding the sum of both arrays together
        total = totalodd + totaleven;
        //Finding out if the number is divisible by 10
        //If it is then end will be 0
        end = total%10;

        //If the end is 0 then say that the card number is valid
        if(end != 0) {
            System.out.println("This card number is not valid");
            return true;
        }
        //If end isn't 0 then saying that the card number isn't valid
        else {
            System.out.println("This card number is valid");
            return false;
        }
        
    }
}