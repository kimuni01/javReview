package ch07.sec03.exam01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // creating SmartPhone object
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        // read the field inherited from Phone
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);
    }
}
