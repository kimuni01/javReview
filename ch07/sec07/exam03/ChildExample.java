package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        // creating object then automatic type conversion
        Parent parent = new Child();

        // use field and methods as Parent type
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        /*
         * parent.field2 = "data2"; // impossible
         * parent.method3(); // impossible
         */
        
        // forced type conversion
        Child child = (Child) parent;
        child.field2 = "data2"; // possible
        child.method3(); // possible
    }
}
