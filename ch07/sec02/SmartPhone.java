package ch07.sec02;

public class SmartPhone extends Phone {
    // declaring field
    public boolean wifi;

    // declaring constructor
    public SmartPhone(String model, String color) {
        this.model = model; // this.model is inherited from Phone class
        this.color = color;
    }

    // declaring method
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}
