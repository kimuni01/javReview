package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
        // Phone phone = new Phone("123"); // impossible

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn(); // method from Phone
        smartPhone.internetSearch();
        smartPhone.turnOff(); // method from Phone
    }
}
