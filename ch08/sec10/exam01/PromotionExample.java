package ch08.sec10.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        // creating the implementing objects
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // declaring the interface variable
        A a;

        // assigning the implementing objects to a variable
        a = b; // A <- B (automatic type conversion)
        a = c; // A <- C (promotion)
        a = d; // A <- D
        a = e; // A <- E
    }
}
