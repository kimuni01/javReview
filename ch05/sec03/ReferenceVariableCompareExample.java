package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1; // declaring an array variable arr1
        int[] arr2; // declaring an array variable arr2
        int[] arr3; // declaring an array variable arr3

        arr1 = new int[] {1, 2, 3}; // make an array {1, 2, 3} then assign to arr1
        arr2 = new int[] {1, 2, 3}; // make an array {1, 2, 3} then assign to arr2
        arr3 = arr2; // assign the array variable arr2 value to array variable arr3

        System.out.println(arr1 == arr2); // check if arr1 and arr2 refers the same array
        System.out.println(arr2 == arr3); // check if arr2 and arr3 refers the same array
    }
}
