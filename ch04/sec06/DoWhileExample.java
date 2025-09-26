package ch04.sec06;

import java.util.Scanner; // required to use a Scanner

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in); // make a Scanner
        String inputString;

        do {
            System.out.print(">");
            inputString = scanner.nextLine(); // read from keyboard
            System.out.println(inputString);
        } while (! inputString.equals("q")); // repeat unless q is given

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
