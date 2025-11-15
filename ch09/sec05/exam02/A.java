package ch09.sec05.exam02;

public class A {
    // instance field of A
    String field = "A-field";

    // instance method of A
    void method() {
        System.out.println("A-method");
    }

    // instnace member class
    class B {
        // instance field of B
        String field = "B-field";

        // instance method of B
        void method() {
            System.out.println("B-method");
        }

        // instance method of B
        void print() {
            // using object B's field and method
            System.out.println(this.field);
            this.method();

            // using field and method of object A
            System.out.println(A.this.field);
            A.this.method();
        }
    }

    // instance method of A
    void useB() {
        B b = new B();
        b.print();
    }
}
