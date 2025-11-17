package ch09.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        // creating Car object
        Car car = new Car();

        // using the field assigned an anonymous inherited object
        car.run1();

        // using the local field assigned an anonymous inherited object
        car.run2();

        // using the parameter assigned an anonymous inherited object
        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
            }
        });
    }
}
