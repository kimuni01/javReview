package ch04.sec03;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> { // only possible since Java 12
                System.out.println("우수 회원입니다."); // no break; needed
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            default -> {
                System.out.println("손님입니다.");
            }
        }

        switch (grade) {
            case 'A', 'a' -> System.out.println("우수 회원입니다."); // curly brackets can
            case 'B', 'b' -> System.out.println("일반 회원입니다."); // be omitted if there
            default -> System.out.println("손님입니다."); // is only 1 execution in brackets
        }
    }
}
