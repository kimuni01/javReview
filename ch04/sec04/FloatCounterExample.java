package ch04.sec04;

public class FloatCounterExample {
    public static void main(String[] args) {
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) { // supposed to iterate 10 times, but
            System.out.println(x); // therefore using float at for's init is discouraged.
        }
    }
}
