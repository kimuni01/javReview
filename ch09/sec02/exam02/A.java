package ch09.sec02.exam02;

public class A {
    // instance member class
    class B {
        // instance field
        int field1 = 1;

        // static field(introduced since Java 17)
        static int field2 = 2;

        // constructor
        B() {
            System.out.println("B-생성자 실행");
        }

        // instance method
        void method1() {
            System.out.println("B-method1 실행");
        }

        // static method(introducted since Java 17)
        static void method2() {
            System.out.println("B-method2 실행");
        }
    }

    // instance method
    void useB() {
        // creating object B AND using instance field AND using instance method
        B b = new B();
        System.out.println(b.field1);
        b.method1();

        // using the static field of B AND static method
        System.out.println(B.field2);
        B.method2();
    }
}
