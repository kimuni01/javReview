package ch07.sec07.exam02;

public class Child extends Parent {
    // method overriding
    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }

    // declaring method
    public void method3() {
        System.out.println("Child-method3()");
    }
}
