package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        // declaring an interface variable THEN assinging an impl. object
        Vehicle vehicle = new Bus();

        // calling via interface
        vehicle.run();
        // vehicle.checkFare(); // doesn't work

        // casting THEN calling
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
