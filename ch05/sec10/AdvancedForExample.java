package ch05.sec10;

public class AdvancedForExample {
    public static void main(String[] args) {
        // declaring and creating an array variable
        int[] scores = {95, 71, 84, 93, 87};
        // getting the sum of the array items
        int sum = 0;
        for (int score : scores) { // each items are assigned to 'score'
            sum = sum + score;
        }
        System.out.println("점수 총합 : " + sum);
        // getting average of the all array items
        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}
