package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        // creating a Car object
        Car myCar = new Car();

        // call the setGas() method which doesn't have return value
        myCar.setGas(5);

        // if the return value of called isLeftGas() is true, execute if block
        if (myCar.isLeftGas()) {
            System.out.println("출발합니다.");

            // call the run() method which doesn't have return value
            myCar.run();
        }

        System.out.println("gas를 주입하세요.");
    }
}
