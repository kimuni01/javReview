package ch06.sec10.exam03;

public class Car {
    // declaring instance field
    int speed;

    // declaring instance method
    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    static void simulate() {
        // creating an object
        Car myCar = new Car();
        // using an instance member
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        // calling a static method
        simulate();

        // creating an object
        Car myCar = new Car();
        // using an instance member
        myCar.speed = 60;
        myCar.run();
    }
}
