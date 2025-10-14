package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        // when creating an object, transfer the ssn and name
        Korean k1 = new Korean("123456-1234567", "감자바");

        // reading the field values
        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // Final fields cannot change the values
        // k1.nation = "USA";
        // k1.ssn = "123-12-1234";

        // non-final fields may change values
        k1.name = "김자바";
    }
}
