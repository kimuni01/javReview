package ch06.sec13.exam03.package1;

public class A {
    // declaring a field with access modifier 'public'
    public int field1;
    // declaring a field with access modifier 'default'
    int field2;
    // declaring a field with access modifier 'private'
    private int field3;

    // declaring a constructor
    public A() {
        field1 = 1; // possible, inside it's origin class does not get affected by access modifiers
        field2 = 1;
        field3 = 1;

        method1();
        method2();
        method3(); // possible
    }

    // declaring a method with access modifier 'public'
    public void method1() {

    }

    // with access modifier 'default'
    void method2() {

    }

    // with access modifier 'private'
    private void method3() {
        
    }
}
