package ch04.sec05;

import java.util.Scanner; // needed to use a Scanner

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // making a Scanner
        boolean run = true; // for controlling the while
        int speed = 0;

        while (run) {
            System.out.println("------------------------------"); // making a menu
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("------------------------------");
            System.out.print("선택 : ");

            String strNum = scanner.nextLine(); // reading what is typed with keyboard

            if (strNum.equals("1")) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            }
            else if (strNum.equals("2")) {
                speed--;
                System.out.println("현재 속도 = " + speed);
            }
            else if (strNum.equals("3")) {
                run = false; // to make the condition of while false
            }
        }

        System.out.println("프로그램 종료");
    }
}
