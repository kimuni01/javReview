package ch06.sec09;

public class Car {
    // declaring fields
    String model;
    int speed;

    // declaring constructor
    Car(String model) {
        this.model = model; // assigning parameter to field(this cannot be omitted)
    }

    // declaring a method
    void setSpeed(int speed) {
        this.speed = speed; // assigning parameter to field(this cannot be omitted)
    }

    void run() {
        this.setSpeed(100);
        System.err.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h)");
    }
}
