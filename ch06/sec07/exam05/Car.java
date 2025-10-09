package ch06.sec07.exam05;

public class Car {
    // declaring fields
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car(String model) {
        // calling the L20 constructor
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        // calling the L20 constructor
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
