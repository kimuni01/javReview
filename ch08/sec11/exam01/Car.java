package ch08.sec11.exam01;

public class Car {
    // fields
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    // method
    void run() {
        tire1.roll(); // calling the abstract method declared on the interface
        tire2.roll(); // running the roll() method of the impl. object
    }
}
