package ch07.sec06.package1; // identical package

public class B {
    // declaring method
    public void method() {
        A a = new A(); // possible
        a.field = "value"; // possible
        a.method(); // possible
    }
}
