import java.util.Scanner;
public class Encryption {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Choose a word or message for me to encrypt.");
        String input = Scan.nextLine();
        System.out.println("Choose a key.");
        int key = Scan.nextInt();
        int idx = 0;
        System.out.println(railFence(input, key, idx));
        //Alphabet encryption and decoder
        /*
        System.out.println(alphabet(input, idx));
        int encrypted[] = {67, 97, 110, 32, 121, 111, 117, 32, 115, 101, 101, 32, 116, 104, 105, 115, 63};
        System.out.println(alphabetdecoder(encrypted));
        */
    }

    //Alphabet encryption and decoder
/*
    public static String alphabet(String input, int idx) {
        for(int a = 0; a < input.length(); a++) {
            System.out.print(input.charAt(idx) + 0 + " ");
            idx++;
        }  
        return "";
    }
    public static String alphabetdecoder(int encrypted[]) {
        char[] convertedChar = new char[encrypted.length];
        String decoded = "";
        for(int b = 0; b < encrypted.length; b++) {
            convertedChar[b] = (char)(encrypted[b]);
            decoded = String.valueOf(convertedChar);
        }
        System.out.println(decoded);
        return "";
    }
    */
    /*
    public static String Ceaser(String input, int idx, int key) {
        int arr[] = new int [input.length()];
        char convert[] = new char[arr.length];
        String newWord = "";
            for(int a = 0; a < input.length(); a++) {
                arr[a] = (input.charAt(idx) + key); 
                arr[a] = ((arr[a] - 64) + key) % 26 + 64;
                idx++;
            }
            for(int b = 0; b < input.length(); b++) {
                convert[b] = (char)(arr[b]);
                newWord = String.valueOf(convert);
            }
        System.out.println(newWord);
        return"";
    }
    */
    public static String railFence(String input, int key, int idx) {
        char arr[] = new char [input.length()];
        int index = input.indexOf(key+1);
        System.out.println(index);
        /*
        for(int a = 0; a < input.length(); a+=key+1) {
            //Need to have letter 1 skip the next however many the key is and take the number after that
            //arr[a] = index;
            System.out.println(arr[a]);
        }
        */
        return "";
    }
    public static String Beufort() {
        return"";
    }
}
