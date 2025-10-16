package ch06.sec13.exam02.package2; // different package

import ch06.sec13.exam02.package1.*;

public class C {
    // declaring fields
    A a1 = new A(true); // possible
    // A a2 = new A(1); // impossible, due to access modifier 'default'
    // A ae = new A("문자열"); // impossible, due to access modifier 'private'
}
