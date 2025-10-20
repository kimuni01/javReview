package ch07.sec04.exam01;

public class Computer extends Calculator {
    // method overriding
    @Override // this can be omitted, checking override during compile time
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
