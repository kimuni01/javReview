package ch07.sec10.exam02;

public class Dog extends Animal {
    // redefining abstract method
    @Override // overriding
    public void sound() {
        System.out.println("멍멍");
    }
}
