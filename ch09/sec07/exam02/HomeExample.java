package ch09.sec07.exam02;

public class HomeExample {
    public static void main(String[] args) {
        // creating Home object
        Home home = new Home();

        // using the field assigned an anonymous impl. object
        home.use1();

        // using the anonymous impl.object assigned local variable
        home.use2();

        // using the anonymous impl.object assigned parameter
        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("난방을 켭니다.");
            }

            public void turnOff() {
                System.out.println("난방을 끕니다.");
            }
        });
    }
}
