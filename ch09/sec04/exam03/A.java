package ch09.sec04.exam03;

public class A {
    // method
    public void method1(int arg) { // final int arg
        // local variable
        int var = 1; // final int var = 1;
        
        // local class
        class B {
            // method
            void method2() {
                // reading local variable
                System.out.println("arg: " + arg); // works
                System.out.println("var: " + var); // works

                // modifying local variables
                // arg = 2; // not working
                // var = 2; // not working
            }
        }

        // creating local object
        B b = new B();
        // calling local object method
        b.method2();

        // modifying local variables
        // arg = 3; // not working
        // var = 3; // not working
    }
}
