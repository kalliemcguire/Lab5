public class Chapter7_5 {
    public static void main(String[] args) {
        
        int[] Array = {5, 23, 29, 3, 8, 12};
        int N = 13;
        
        greaterThanN(Array, N);
    }
    
    public static void greaterThanN(int[] Array, int N) {
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > N) {
                System.out.println("Number greater than " + N + ": " + (Array[i]));
            }     
        }        
    }
}


