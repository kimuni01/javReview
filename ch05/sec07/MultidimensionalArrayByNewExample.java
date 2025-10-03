package ch05.sec07;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        // if each classes have same students count, make a 2D array to save scores
        int[][] mathScores = new int[2][3];
        // print the initialized values of the array
        for (int i = 0; i < mathScores.length; i++) { // iterate for classes count
            for (int k = 0; k < mathScores[i].length; k++) { // iterate for students count
                System.out.println("mathScores[" + i + "][" + k + "] : " + mathScores[i][k]);
            }
        }
        System.out.println();
        // change the array values
        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;
        // getting the average of total students math scores
        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScores.length; i++) { // iterate for classes count
            totalStudent += mathScores[i].length; // sum the total students count
            for (int k = 0; k < mathScores[i].length; k++) { // iterate for students count
                totalMathSum += mathScores[i][k]; // sum the student scores
            }
        }
        double totalMathAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 수학 평균 점수 : " + totalMathAvg);
        System.out.println();

        // if each classes have different students count, make a 2D array for saving scores
        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        // printing the initialized array values
        for (int i = 0; i < englishScores.length; i++) { // iterate for classes count
            for (int k = 0; k < englishScores[i].length; k++) { // iterate for students count
                System.out.println("englishScores[" + i + "][" + k + "] : " + englishScores[i][k]);
            }
        }
        System.out.println();
        // changing the array values
        englishScores[0][0] = 90;
        englishScores[0][1] = 91;
        englishScores[1][0] = 92;
        englishScores[1][1] = 93;
        englishScores[1][2] = 94;
        // getting the average of all students english score
        totalStudent = 0;
        int totalEnglishSum = 0;
        for (int i = 0; i < englishScores.length; i++) { // iterate for classes count
            totalStudent += englishScores[i].length; // sum the students count
            for (int k = 0; k < englishScores[i].length; k++) { // iterate for students count
                totalEnglishSum += englishScores[i][k];
            }
        }
        double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
        System.out.println("전체 학생의 영어 평균 점수 : " + totalEnglishAvg);
    }
}
