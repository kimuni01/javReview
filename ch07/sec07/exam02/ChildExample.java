package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // creating child object
        Child child = new Child();

        // automatic type conversion
        Parent parent = child;

        // calling the methods
        parent.method1();
        parent.method2();
        // parent.method3(); // (cannot be called)
    }
}
