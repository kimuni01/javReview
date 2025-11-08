package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        // creating the Car object
        Car myCar = new Car();

        // executing the run() method
        myCar.run();

        // replacing the Tire objects
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();

        // running the run() method(Polymorphism : different execution outcomes)
        myCar.run();
    }
}
