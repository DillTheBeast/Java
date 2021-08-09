import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
System.out.println("How many items do you want on your shopping list?");
int input;
String foodinput;
input = Scan.nextInt();
String[] Shoppinglist = new String[input];
Scan.nextLine();
for(int x = 0; x < input; x++) {
    System.out.println("What item do you want to add to your shopping list?");
    foodinput = Scan.nextLine();
    Shoppinglist[x] = foodinput;
    
}
    System.out.println("Here is your shopping list.");
    for(int x = 0; x < input; x++) {
        System.out.println(Shoppinglist[x]);
    }

        
    }
}
