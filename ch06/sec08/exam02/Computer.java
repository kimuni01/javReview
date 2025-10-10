package ch06.sec08.exam02;

public class Computer {
    // declaring a method that has variable length argument
    int sum(int ... values) {
        int sum = 0;

        // values is used like an array type variable
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        // returning the sum result
        return sum;
    }
}
