package ch06.sec13.exam03.package1; // identical package

public class B {
    public void method() {
        // declaring an object
        A a = new A();
        
        // changing field values
        a.field1 = 1; // possible
        a.field2 = 1;
        // a.field3 = 1; // impossible, due to access modifier 'private', compiler error

        // calling a method
        a.method1(); // possible
        a.method2();
        // a.method3(); // impossible, due to access modifier 'private', compiler error
    }
}
