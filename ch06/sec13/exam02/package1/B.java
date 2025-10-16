package ch06.sec13.exam02.package1; // identical package

public class B {
    // declaring fields
    A a1 = new A(true); // possible
    A a2 = new A(1); // possible
    // A a3 = new A("문자열"); // impossible due to private access modifier
    // compiler error
}
