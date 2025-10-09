package ch06.sec07.exam04;

public class Car {
    // declaring fields
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // declaring constructors
    Car() {}

    Car(String model) {
        this.model = model;
    }

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
