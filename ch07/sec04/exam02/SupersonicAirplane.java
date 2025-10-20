package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane {
    // declaring constants
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    // declaring status field
    public int flyMode = NORMAL;

    // redefining the method
    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        }
        else {
            // calling the fly() method of the Airplane object
            super.fly();
        }
    }
}
