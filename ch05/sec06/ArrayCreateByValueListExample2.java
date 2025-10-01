package ch05.sec06;

public class ArrayCreateByValueListExample2 {
    public static void main(String[] args) {
        // declaring an array variable
        int[] scores;
        // assigning an array on an array variable
        scores = new int[] {83, 90, 87};
        // getting sum of the array variable THEN print
        int sum1 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += scores[i];
        }
        System.out.println("총합 : " + sum1);

        // giving an array as a parameter THEN call printItem() method
        printItem(new int[] {83, 90, 87});
    }

    // declaring printItem() method
    public static void printItem(int[] scores) {
        // print the array that parameter refers to
        for (int i = 0; i < 3; i++) {
            System.out.println("score[" + i + "] : " + scores[i]);
        }
    }
}
