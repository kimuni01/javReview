package ch07.sec09;

public class Student extends Person {
    // declaring field
    public int studentNo;

    // declaring constructor
    public Student(String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }

    // declaring method
    public void study() {
        System.out.println("공부를 합니다.");
    }
}
