package ch07.sec05.exam02;

public class Car {
    // declaring a field
    public int speed;

    // declaring methods
    public void speedUp() {
        speed += 1;
    }

    // final method
    public final void stop() {
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
