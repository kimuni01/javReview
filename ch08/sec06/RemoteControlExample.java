package ch08.sec06;

public class RemoteControlExample {
    public static void main(String[] args) {
        // declaring interface variable
        RemoteControl rc;

        // creating Television object then assigning to the interface variable
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        // calling the default methods
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        // creating Audio object then assigning to the interface variable
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        // calling the default method
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        // calling the static method
        RemoteControl.changeBattery();
    }
}
