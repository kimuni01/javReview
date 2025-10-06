package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        // making a Car object
        Car myCar = new Car();

        // myCar.speed = 1000;
        // reading the field values of Car object
        System.out.println("모델명 : " + myCar.model);
        System.out.println("시동여부 : " + myCar.start);
        System.out.println("현재속도 : " + myCar.speed);
    }
}
