import java.util.Scanner;
import java.util.ArrayList;
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
        ArrayList<ArrayList<Character>> al = new ArrayList<ArrayList<Character>>(key); 

        for(int  i = 0; i < key; i++){
            al.add(new ArrayList<Character>());
        }


        for(int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            int position = i % key;
            al.get(position).add(letter);
            //System.out.println(al.get(position).toString());
        }
        for(int i = 0; i < key; i++) {
            al.addAll(al);
            int finalposition = i % key;
            System.out.print(al.get(finalposition).toString() + " ");
        }

        return "";
    }
    public static String Beufort() {
        return"";
    }
}
