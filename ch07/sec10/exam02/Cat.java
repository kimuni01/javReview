package ch07.sec10.exam02;

public class Cat extends Animal {
    // redefining abstract method
    @Override // overriding
    public void sound() {
        System.out.println("야옹");
    }
}
