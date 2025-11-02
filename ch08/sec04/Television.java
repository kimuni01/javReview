package ch08.sec04;

public class Television implements RemoteControl {
    // field
    private int volume;

    // overriding the turnOn() abstract method
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    // overriding the turnOff() abstract method
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    // overriding the setVolume() abstract method
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨: " + this.volume);
    }
}
