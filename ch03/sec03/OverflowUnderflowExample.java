package ch03.sec03;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i = 0; i < 5; i++) { // repeats { } for 5 times
            var1++; // ++ operation increases the value of var1 by 1.
            System.out.println("var1 : " + var1);
        }

        System.out.println("--------------------");

        byte var2 = -125;
        for(int i = 0; i < 5; i ++) { // repeats { } for 5 times
            var2--; // -- operation decreases the value of var2 by 1.
            System.out.println("var2 : " + var2);
        }
    }
}
