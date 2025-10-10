package ch06.sec08.exam01;

public class Calculator {
    // declaring a method without return value
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    // declaring a method without return value
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // declaring a method that receives 2 integers when called,
    // returning result value int
    int plus(int x, int y) {
        int result = x + y;
        return result; // setting the return value
    }

    // declaring a method that receives 2 integers when called,
    // returning result value double
    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result; // assigning the return value
    }
}
