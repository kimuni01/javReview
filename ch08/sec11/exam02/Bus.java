package ch08.sec11.exam02;

public class Bus implements Vehicle {
    // redefining the abstract method
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
