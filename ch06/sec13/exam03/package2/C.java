package ch06.sec13.exam03.package2; // different package

import ch06.sec13.exam03.package1.*;

public class C {
    public C() {
        // creating an object
        A a = new A();

        // changing field values
        a.field1 = 1;
        // a.field2 = 1; // cannot access 'default' field, compiler error
        // a.field3 = 1; // cannot access 'private' field, compiler error

        // calling methods
        a.method1();
        // a.method2(); // cannot access 'default' method, compiler error
        // a.method3(); // cannot access 'private' method, compiler error
    }
}
