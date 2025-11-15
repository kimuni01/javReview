package ch09.sec05.exam01;

public class A {
    // instance field and method of A
    int field1;
    void method1() {}

    // static field and method of A
    static int field2;
    static void method2() {}

    // instance member class
    class B {
        void method() {
            // using A's instance field and method
            field1 = 10; // works
            method1(); // works
            // using static field and method of A
            field2 = 10; // works
            method2(); // works
        }
    }

    // static member class
    static class C {
        void method() {
            // using A's instance fiend and method
            // field1 = 10; // not working
            // method1(); // not working
            // using static field and method of A
            field2 = 10; // working
            method2(); // working
        }
    }
}
