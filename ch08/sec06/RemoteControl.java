package ch08.sec06;

public interface RemoteControl {
    // constant fields
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // abstract methods
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // default method
    default void setMute(boolean mute) {
        // omitted as it's supposed to be the same with previous 
    }

    // static method, either public or private
    static void changeBattery() { // public automatically added
        System.out.println("리모컨 건전지를 교환합니다.");
    }
}
