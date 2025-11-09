package ch08.sec11.exam02;

public class DriverExample {
    public static void main(String[] args) {
        // creating the Driver object
        Driver driver = new Driver();

        // creating the Vehicle impl. objects
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

        // assigning the impl. objects as parameters(Polymorphism: different execution outcome)
        driver.drive(bus);
        driver.drive(taxi);
    }
}
