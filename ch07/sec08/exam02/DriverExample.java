package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        // creating Driver object
        Driver driver = new Driver();

        // providing Bus object as parameter then call driver() method
        Bus bus = new Bus();
        driver.drive(bus); // equal as driver.drive(new Bus());

        // providing Taxi object as parameter then call driver() method
        Taxi taxi = new Taxi();
        driver.drive(taxi); // identical with driver.drive(new Taxi());
    }
}
