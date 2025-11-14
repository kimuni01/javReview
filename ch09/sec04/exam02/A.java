package ch09.sec04.exam02;

public class A {
    // method
    void useB() {
        // local class
        class B {
            // instance field
            int field1 = 1;

            // static field(allowed since Java 17)
            static int field2 = 2;

            // constructor
            B() {
                System.out.println("B-생성자 실행");
            }

            // instance method
            void method1() {
                System.out.println("B-method1 실행");
            }

            // static method(allowed since Java 17)
            static void method2() {
                System.out.println("B-method2 실행");
            }
        }

        // creating local object
        B b = new B();

        // using the local object's instance field and instance method
        System.out.println(b.field1);
        b.method1();

        // using static field and static method of the local class(allowed since Java 17)
        System.out.println(B.field2);
        B.method2();
        // b.method2(); // almost missed this detail, B. versus b.
    }
}
