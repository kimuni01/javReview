package ch06.sec13.exam02.package1;

public class A {
    // declaring fields
    A a1 = new A(true);
    A a2 = new A(1);
    A a3 = new A("문자열");

    // declaring a public access modifier
    public A(boolean b) {

    }

    // declaring a default access modifier
    A(int b) { // cannot add 'default', compiler error

    }

    // declaring a private access modifier
    private A(String s) {

    }
}
