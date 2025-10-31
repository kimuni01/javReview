package ch08.sec02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        // rc = new Television();
        // rc.turnOn();
        // RemoteControl rc = new Television(); // can be used instead

        // assigning Television object to variable rc
        rc = new Television();
        rc.turnOn();

        // assigning Audio object to variable rc(replacing)
        rc = new Audio();
        rc.turnOn();
    }
}
