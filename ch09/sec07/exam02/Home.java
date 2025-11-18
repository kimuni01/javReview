package ch09.sec07.exam02;

public class Home {
    // assigning anonymous impl. object on the field
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    // method(using the field)
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    // method(using the local variable)
    public void use2() {
        // assigning anonymous impl. object to a local variable
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다.");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    // method(using a parameter)
    public void use3(RemoteControl rc) {
        // this.rc.turnOn(); // this sends to the private field in Home.java
        rc.turnOn();
        rc.turnOff();
    }
}
