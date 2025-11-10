package ch08.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        // creating the impl. object
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        // when ride() method is called, transfer the impl. objects as parameters
        ride(taxi);
        System.out.println();
        ride(bus);
    }

    // a method with an interface variable as its parameter
    public static void ride(Vehicle vehicle) {
        // way 1
        /* if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        } */

        // way 2
        if (vehicle instanceof Bus bus) { // available since Java 12
            bus.checkFare();
        }

        vehicle.run();
    }
}
