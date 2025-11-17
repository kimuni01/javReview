package ch09.sec07.exam01;

public class Car {
    // assigning Tire object to field
    private Tire tire1 = new Tire();

    // assigning anonymous inherited object to a field
    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
        }
    };

    // method(using the field)
    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    // method(using a local variable)
    public void run2() {
        // assining anonymous inherited object to a local variable
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
            }
        };
        tire.roll();
    }

    // method(using a parameter)
    public void run3(Tire tire) {
        tire.roll();
    }
}
