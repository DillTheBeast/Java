public class TestRecursion {
    public static void main(String[] args) {
        int n = 0;
        Test(n);
    }

    public static void Test(int n) {
        if(n < 5){
            System.out.println("Hello");
            Test(n+1);
        }
    }
}
