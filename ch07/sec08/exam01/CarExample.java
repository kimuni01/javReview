package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        // creating Car object
        Car myCar = new Car();

        // fitting a Tire object
        myCar.tire = new Tire();
        myCar.run();

        // fitting a HankookTire object
        myCar.tire = new HankookTire();
        myCar.run();

        // fitting a KumhoTire object
        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
