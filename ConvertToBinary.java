import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertToBinary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        convert(num);
    }
    public static List<Integer> convert(int num) {

        List<Integer> binary = new ArrayList<>();

        int remainder = 0;
        while (num > 0) {
            remainder = num % 2;
            binary.add(0, remainder);
            num = num / 2;
        }
        System.out.println(binary);
        return binary;
    }
}