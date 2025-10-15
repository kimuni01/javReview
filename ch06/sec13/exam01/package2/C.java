package ch06.sec13.exam01.package2; // different package

import ch06.sec13.exam01.package1.*;

public class C {
    // declaring fields
    A a; // cannot access class A(compiler error)
    B b; // works
}
