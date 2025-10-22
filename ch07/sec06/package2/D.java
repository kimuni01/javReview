package ch07.sec06.package2; // different package

import ch07.sec06.package1.A;

public class D extends A {
    // declaring constructor
    public D() {
        // calling constructor A()
        super(); // possible // only usable via inheritance
    }

    // declaring method
    public void method1() {
        // changing A field value
        this.field = "value"; // possible // only usable via inheritance
        // super.field = "123"; // also possible
        this.method(); // possible
    }

    // declaring another method
    public void method2() {
        // A a = new A(); // impossible // cannot make a new object to use
        // a.field = "value"; // impossible
        // a.method(); // impossible
    }
}
