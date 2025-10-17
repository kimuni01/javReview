package ch06.sec14;

public class Car {
    // declaring fields
    private int speed;
    private boolean stop;

    // declaring Getter/Setter of the 'speed' field
    public int getSpeed() { // speed is all lowercase but first letter is converted to uppercase
        return speed;
    }
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        }
        else {
            this.speed = speed;
        }
    }

    // declaring Getter/Setter of the 'stop' field
    public boolean isStop() { // for boolean getters, starting with 'is' is conventional
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop == true) this.speed = 0;
    }
}
