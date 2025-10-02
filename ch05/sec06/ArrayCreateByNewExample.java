package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        // declaring and creating an array variable
        int[] arr1 = new int[3];
        // printing the initialized values of the array
        for (int i = 0; i < 3; i++) {
            System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
        }
        System.out.println();
        // changing the array values
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        // printing the changed array values
        for (int i = 0; i < 3; i++) {
            System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
        }
        System.out.println("\n");

        // declaring and creating an array variable
        double[] arr2 = new double[3];
        // printing the initialized values of the array
        for (int i = 0; i < 3; i++) {
            System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
        }
        System.out.println();
        // changing the array values
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        // printing the changed array values
        for (int i = 0; i < 3; i++) {
            System.out.print("arr2[" + i + "]" + arr2[i] + ", ");
        }
        System.out.println("\n");

        // declaring and creating an array variable
        String[] arr3 = new String[3];
        // printing the initialized values of the array
        for (int i = 0; i < 3; i++) {
            System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
        }
        System.out.println();
        // changing the array values
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        // printing the changed array values
        for (int i = 0; i < 3; i++) {
            System.out.print("arr3[" + i + "] : " + arr3[i] + ", ");
        }
    }
}
