package ch08.sec10.exam02;

public class Bus implements Vehicle {
    // redefining the abstract method
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }

    // additional method
    public void checkFare() {
        System.out.println("승차요금을 확인합니다.");
    }
}
