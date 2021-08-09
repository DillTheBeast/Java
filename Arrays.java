public class Arrays {
    public static void main(String[] args) {
        int[] intarray = new int[10];

        for(int x = 0; x < intarray.length; x++) {
            if(x%2 == 0 && x != 0) {
                intarray[x] = intarray[x-1] -4;
            }
            else if(x%2 != 0 && x != 0) {
                intarray[x] = intarray[x-1] +3;
            }
            else {
                intarray[x] = -4;
            }
        }
    
        for(int x = 0; x < intarray.length; x++) {
            System.out.println(intarray[x]);
        }
        
        
    }
}
