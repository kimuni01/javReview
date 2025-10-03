package ch05.sec09;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        // array of length 3
        int[] oldIntArray = {1, 2, 3};
        // making a new array of length 5
        int[] newIntArray = new int[5];
        // copying array values
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
        // printing array values
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.print(newIntArray[i] + ", ");
        }
    }
}
