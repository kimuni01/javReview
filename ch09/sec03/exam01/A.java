package ch09.sec03.exam01;

public class A {
    // static member class
    static class B {}

    // assign object B as an instance field value
    B field1 = new B();

    // assign object B as a static field value
    static B field2 = new B();

    // constructor
    A() {
        B b = new B();
    }

    // instance method
    void method1() {
        B b = new B();
    }

    // static method
    static void method2() {
        B b = new B();
    }
}
