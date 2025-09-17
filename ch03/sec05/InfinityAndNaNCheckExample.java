package ch03.sec05;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y; // "Infinity"
        // double z = x % y; // "NaN"

        // wrong code
        System.out.println(z + 2);

        // correct code
        if (Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
            // System.out.println(z > 100); z(Infinity) > 100 is true, z(NaN) > 100 is false
        }
        else {
            System.out.println(z + 2);
        }
    }
}
