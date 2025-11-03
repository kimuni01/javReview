package ch08.sec05;

public interface RemoteControl {
    // constant fields
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // abstact methods
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    // default instance method
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            // using the constant field while calling the abstract method
            setVolume(MIN_VOLUME);
        }
        else {
            System.out.println("무음 해제합니다.");
        }
    }
}
