package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍"); // getting the index number
        System.out.println(location);
        String subString = subject.substring(location); // index, from location to the end
        System.out.println(subString);

        location = subject.indexOf("자바");
        if (location != -1) { // conducting the same job 1 // if the "자바" is in 
            System.out.println("자바와 관련된 책이군요.");
        }
        else {
            System.out.println("자바와 관련 없는 책이군요.");
        }

        boolean result = subject.contains("자바");
        if (result) { // conducting the same job 1
            System.out.println("자바와 관련된 책이군요.");
        }
        else {
            System.out.println("자바와 관련 없는 책이군요.");
        }
    }
}
