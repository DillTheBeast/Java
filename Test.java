public class Test {
    public static void main(String[] args) {
        int x = 0;
        for(int i = 1; i <= 12; i++) {
            while(x<= i) {
                if(x%2 == 0) {
                    x+=2;
                }
                else {
                    i -= 2;
                }
            }
        }
        System.out.println(x);
    }
}
