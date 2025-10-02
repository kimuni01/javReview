package ch05.sec06;

public class ArrayLengthExample {
    public static void main(String[] args) {
        // declaring and creating an array variable
        int[] scores = {84, 90, 96};

        // getting the sum of the array variable
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        // getting the average of the array variable
        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}
