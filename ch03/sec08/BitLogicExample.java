package ch03.sec08;

public class BitLogicExample {
    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));
        System.out.println("------------------------------");

        byte receiveData = -120; // lore : a small embedded device with C program could
        // transfer uint_8 type to Java, which is 0~255 to -128~127.
        // way 1 : getting an Unsigned integer using bitwise AND
        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);

        // way 2 : using a Java API to get an Unsigned integer
        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);

        int test = 136; // the first bit for sign is removed upon conversion to byte?
        byte btest = (byte) test;
        System.out.println(btest);
    }
}
