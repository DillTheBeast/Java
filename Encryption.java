import java.util.Scanner;
import java.util.ArrayList;
public class Encryption {
    public static void main(String[] args) {
        int idx = 0;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Choose a word or message for me to encrypt.");
        String input = Scan.nextLine();
        //Only used for railFence
        /*
        System.out.println("Choose a key.");
        int key = Scan.nextInt();
        */
        //Only for Beufort
        System.out.println("Choose a keyword to help cypher your word");
        String bKey = Scan.nextLine();
        System.out.println(Beufort(input, bKey, idx));
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
    /*
    public static String railFence(String input, int key, int idx) {
        ArrayList<ArrayList<Character>> al = new ArrayList<ArrayList<Character>>(key); 
        int position;
        char letter;
        int n = 0;
        boolean isGoingUp = true;

        for(int  i = 0; i < key; i++){
            al.add(new ArrayList<Character>());
        }


        for(int i = 0; i < input.length(); i++) {
            letter = input.charAt(i);
            position = n % key;
            al.get(position).add(letter);
            System.out.println(n);

            if(isGoingUp == false) {
                n--;
                System.out.println("Test1");
            }

            if(isGoingUp == true) {
                n++;
                System.out.println("Test2");
            }
            if(n == key-1) {
                isGoingUp = false;
                System.out.println("Test3");
            }

            if(n == 0) {
                isGoingUp = true;
                System.out.println("Test4");
            }
            
            
            
            

            //System.out.println(al.get(position).toString());
        }
        for(int i = 0; i < key; i++) {
            al.addAll(al);
            int finalposition = i % key;
            System.out.print(al.get(finalposition) + " ");
        }

        return "";
    }
    public static void print(ArrayList<ArrayList<Character>> al) {
        
    }
    */
    public static String Beufort(String input, String bKey, int idx) {
        int idx2 = idx;
        char keyStream[] = new char[input.length()];
        for(int i = 0; i < input.length(); i++) {
            keyStream[i] = bKey.charAt(idx);
            System.out.println(keyStream[i]);
        }
        return "";
    }
}
