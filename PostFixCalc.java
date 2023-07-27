import java.util.Scanner;

public class PostFixCalc {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        String equationString = "";
        boolean done = false;
        System.out.println("Please enter the post fix equation");
        equationString = Scan.nextLine();
        String[] equationArray = equationString.split(" ");
        int numCount = 0;
        Stack stack = new Stack(2);
        int num1;
        int num2;
        int ans = 0;
        boolean first = true;

        for(int i = 0; i < equationArray.length; i++) {
            try {
                if(equationArray[i].equals("+")) {
                    if(first == true) {
                        num2 = stack.pop();
                        num1 = stack.pop();
                        ans = num1 + num2;
                        first = false;
                    }
                    else {
                        num2 = stack.pop();
                        ans = ans + num2;
                    }
                }
                else if(equationArray[i].equals("-")) {
                    if(first == true) {
                        num2 = stack.pop();
                        num1 = stack.pop();
                        ans = num1 - num2;
                        first = false;
                    }
                    else {
                        num2 = stack.pop();
                        ans = ans - num2;
                    }
                }
                else if(equationArray[i].equals("*")) {
                    if(first == true) {
                        num2 = stack.pop();
                        num1 = stack.pop();
                        ans = num1 * num2;
                        first = false;
                    }
                    else {
                        num2 = stack.pop();
                        ans = ans * num2;
                    }
                }
                else if(equationArray[i].equals("/")) {
                    if(first == true) {
                        num2 = stack.pop();
                        num1 = stack.pop();
                        ans = num1 / num2;
                        first = false;
                    }
                    else {
                        num2 = stack.pop();
                        ans = ans / num2;
                    }
                }
                else {
                    try {
                        stack.push(Integer.valueOf(equationArray[i]));
                    } catch (Exception e) {
                        throw new IllegalStateException("This is not a number or an operation");
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Invalid Notation");
                break;
            }
        }
        System.out.println(ans);
    }
}
