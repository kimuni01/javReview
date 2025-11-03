package ch08.sec05;

public class RemoteControlExample {
    public static void main(String[] args) {
        // declaring the interface method
        RemoteControl rc;

        // creating the Television object THEN assigning to the interface variable
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        // calling the default method
        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        // declaring Audio object THEN assigning to the interface variable
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);

        // calling the default method
        rc.setMute(true);
        rc.setMute(false);
    }
}
