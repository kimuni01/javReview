package ch07.sec09;

public class InstanceofExample {
    // declaring a static method so that this can be called right at main() method
    public static void personInfo(Person person) {
        System.out.println("name: " + person.name);
        person.walk();

        // checking if the object that person refers to is Student type
        // if (person instanceof Student) {
        //     // if it is a Student object, conduct casting
        //     Student student = (Student) person;
        //     // using field and method that only Student objects have
        //     System.out.println("studentNo: " + student.studentNo);
        //     student.study();
        // }

        // if the object that person refers to is a Student type,
        // assign to student variable(type conversion happens)
        if (person instanceof Student student) {
            System.out.println("studentNo: " + student.studentNo);
            student.study();
        }

    }

    public static void main(String[] args) {
        // provide Person object as a parameter then call personInfo() method
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("김길동", 10);
        personInfo(p2);
    }
}
