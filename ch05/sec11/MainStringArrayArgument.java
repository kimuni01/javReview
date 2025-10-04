package ch05.sec11;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if (args.length != 2) { // if given arguments are not 2
            System.out.println("프로그램 입력값이 부족");
            System.exit(0); // forced shutdown of program
        }

        String strNum1 = args[0]; // getting the first data
        String strNum2 = args[1]; // getting the second data

        int num1 = Integer.parseInt(strNum1); // converting String into integer
        int num2 = Integer.parseInt(strNum2); // converting String into integer

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
