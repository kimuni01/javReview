package ch06.sec11.exam01;

public class Korean {
    // declaring instance final fields
    final String nation = "대한민국";
    final String ssn;

    // declaring instance field
    String name;

    // declaring constructor
    public Korean(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
