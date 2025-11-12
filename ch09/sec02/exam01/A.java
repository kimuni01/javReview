package ch09.sec02.exam01;

public class A {
    // instance member class
    class B {}

    // assigning object B as the instance field value
    B field = new B();

    // constructor
    A() {
        B b = new B();
    }

    // instance method
    void method() {
        B b = new B();
    }
}
