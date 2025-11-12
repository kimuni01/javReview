package ch09.sec02.exam01;

public class AExample {
    public static void main(String[] args) {
        // creating object A
        A a = new A();

        // creating object B
        A.B b = a.new B();
    }
}
