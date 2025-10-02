package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        // creating a 2D array
        int[][] scores = {
            {80, 90, 96},
            {76, 88}
        };

        // length of the array
        System.out.println("1차원 배열 길이(반의 수) : " + scores.length);
        System.out.println("2차원 배열 길이(첫 번째 반의 학생 수) : " + scores[0].length);
        System.out.println("2차원 배열 길이(두 번째 반의 학생 수) : " + scores[1].length);

        // reading the score of the first class, third student
        System.out.println("scores[0][2] : " + scores[0][2]);

        // reading the score of the second class, first student
        System.out.println("scores[1][1] : " + scores[1][1]);

        // getting the average score of the first class
        int class1Sum = 0;
        for (int i = 0; i < scores[0].length; i++) {
            class1Sum += scores[0][i];
        }
        double class1Avg = (double) class1Sum / scores[0].length;
        System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);

        // getting the average score of the second class
        int class2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i];
        }
        double class2Avg = (double) class2Sum / scores[1].length;
        System.out.println("두 번째 반의 평균 점수 : " + class2Avg);

        // getting the average score of all students
        int totalStudent = 0;
        int totalSum = 0;
        for (int i = 0; i < scores.length; i++) { // iterate for number of classes
            totalStudent += scores[i].length; // sum the students of class
            for (int k = 0; k < scores[i].length; k++) { // iterate for that class students
                totalSum += scores[i][k]; // sum the student scores
            }
        }
        double totalAvg = (double) totalSum / totalStudent;
        System.out.println("전체 학생의 평균 점수 : " + totalAvg);
    }
}
