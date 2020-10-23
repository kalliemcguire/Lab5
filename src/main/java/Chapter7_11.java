public class Chapter7_11 {
    public static void main(String[] args) {
        
        int[] integerArray = {8, 5, 21, 6, 14, 18};
        
        System.out.println("Total of values in array is " + getTotal(integerArray));
        System.out.println("Average of values in array is " + getAverage(integerArray));
        System.out.println("Highest value in array is " + getHighest(integerArray));
        System.out.println("Lowest value in array is " + getLowest(integerArray));
        
    }
    
    public static int getTotal(int[] Array) {
        int arrayTotal = 0;
        
        for (int i = 0; i < Array.length; i++) {
            arrayTotal += Array[i];
        }
        
        return arrayTotal;
    }
    
    public static int getAverage(int[] Array) {
        return getTotal(Array) / Array.length;
    }
    
    public static int getHighest(int[] Array) {
        int highestValue = 0;
        
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] >= highestValue) {
                highestValue = Array[i];
            }
        }
        return highestValue;
    }
    
    public static int getLowest(int[] Array) {
        int lowestValue = Array[0];
        
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] <= lowestValue) {
                lowestValue = Array[i];
            }
        }
        return lowestValue;
    }
}
