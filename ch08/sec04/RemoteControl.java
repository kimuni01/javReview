package ch08.sec04;

public interface RemoteControl {
    // constant fields
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // abstract methods
    void turnOn(); // only the declarations
    void turnOff();
    void setVolume(int volume);
}
