package ch07.sec03.exam02;

public class SmartPhone extends Phone {
    // declaring child constructor
    public SmartPhone(String model, String color) {
        super(model, color); // has to be written
        System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
    }
}
