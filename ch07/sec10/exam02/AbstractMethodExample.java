package ch07.sec10.exam02;

public class AbstractMethodExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        // polymorphism of parameters
        animalSound(new Dog()); // conducting automatic type conversion = promotion
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal) { // conducting automatic type conversion
        animal.sound(); // calling the redefined method
    }
}
