package ch06.sec15;

public class Singleton {
    // declaring and initializing a static field with private access modifier
    private static Singleton singleton = new Singleton();

    // declaring a constructor with access modifier 'private'
    private Singleton() {

    }

    // declaring a static method with access modifier 'public'
    public static Singleton getInstance() {
        return singleton;
    }
}
