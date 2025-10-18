package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // creating SmartPhone object
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        // reading the fields inherited from 'Phone'
        System.out.println("모델 : " + myPhone.model);
        System.out.println("색상 : " + myPhone.color);

        // reading fields of SmartPhone
        System.out.println("와이파이 상태 : " + myPhone.wifi);

        // calling the methods inherited from 'Phone'
        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        myPhone.sendVoice("아~ 네, 반갑습니다.");
        myPhone.hangUp();

        // calling method of 'SmartPhone'
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
