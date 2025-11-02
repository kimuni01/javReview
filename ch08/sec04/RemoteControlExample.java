package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        // declaring interface variable
        RemoteControl rc;

        // create Television object THEN assign to the interface variable
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // create Audio object THEN assign to the interface variable
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
