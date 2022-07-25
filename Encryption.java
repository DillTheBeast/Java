import java.util.Scanner;
import java.util.ArrayList;
public class Encryption {
    public static void main(String[] args) {
        int idx = 0;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Choose a word or message for me to encrypt.");
        String input = Scan.nextLine();
        //System.out.println("Choose a key.");
        //int key = Scan.nextInt();
        //System.out.println(vigenere(input, key, idx));
        
        //Only used for railFence
        /*
        System.out.println("Choose a key.");
        int key = Scan.nextInt();
        */
        //Only for Beufort
        
        System.out.println("Choose a keyword to help cypher your word");
        String bKey = Scan.nextLine();
        System.out.println(vigenere(input, bKey, idx));
        

        //Alphabet encryption and decoder
        /*
        System.out.println(alphabet(input, idx));
        int encrypted[] = {67, 97, 110, 32, 121, 111, 117, 32, 115, 101, 101, 32, 116, 104, 105, 115, 63};
        System.out.println(alphabetdecoder(encrypted));
        */
        
    }

    //Alphabet encryption and decoder
    public static String alphabet(String input) {
        for(int a = 0; a < input.length(); a++) {
            System.out.print(input.charAt(a) + 0 + " ");
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

            if(isGoingUp == false) {
                n--; 
            }

            if(isGoingUp == true) {
                n++;
            }
            if(n == key-1) {
                isGoingUp = false;
            }

            if(n == 0) {
                isGoingUp = true;
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
 
    public static String vigenere(String input, String bKey, int idx) {
        int idx2 = idx;
        char keyStream[] = new char[input.length()];
        char cipherText[] = new char[input.length()];
        //iNum = input number and kNum = key number
        int kNum;
        int iNum;
        //Creating keystream    
        for(int i = 0; i < input.length(); i++) {
            keyStream[i] = bKey.charAt(idx2);
            idx2 = (idx2+1) % bKey.length();
            
        }
        //New letter = iNum + kNum - 1
        for(int i = 0; i < input.length(); i++) {
            kNum = keyStream[i] - 64;
            iNum = input.charAt(i) - 64;
            cipherText[i] = (char)((iNum + kNum) % 26 - 1 + 64);
            System.out.print(cipherText[i]);
            System.out.println("");
            
        }
        return "";
    }
    
}
