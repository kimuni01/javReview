package ch08.sec11.exam02;

public class Taxi implements Vehicle {
    // redefining the abstract method
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
