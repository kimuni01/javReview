package ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        // array of length 3
        String[] oldStrArray = {"java", "array", "copy"};
        // making a new array of length 5
        String[] newStrArray = new String[5];
        // copying the array items
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        // printing the array items
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
