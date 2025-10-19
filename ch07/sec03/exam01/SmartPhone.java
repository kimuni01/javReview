package ch07.sec03.exam01;

public class SmartPhone extends Phone{
    // declaring child constructor
    public SmartPhone(String model, String color) {
        super(); // this can be omitted, automatically generated during compile time
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
