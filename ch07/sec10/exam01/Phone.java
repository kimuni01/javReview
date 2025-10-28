package ch07.sec10.exam01;

public abstract class Phone {
    // declaring field
    String owner;

    // declaring constructor
    Phone (String owner) {
        this.owner = owner;
    }

    // declaring methods
    void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }
    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}
