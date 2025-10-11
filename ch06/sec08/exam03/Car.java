package ch06.sec08.exam03;

public class Car {
    // declaring a field
    int gas;

    // change the gas field value by receiving parameter from a method without return value
    void setGas(int gas) {
        this.gas = gas;
    }

    // a method whose return value is boolean, if gas field is 0 then false
    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없습니다.");
            return false; // return false then end the method
        }
        System.out.println("gas가 있습니다.");
        return true; // return true then end the method
    }

    // a method without return value, if gas field is 0 then end the method with return
    void run() {
        while(true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량 : " + gas + ")");
                gas -= 1;
            }
            else {
                System.out.println("멈춥니다.(gas잔량 : " + gas + ")");
                return; // end of method
            }
        }
    }
}
