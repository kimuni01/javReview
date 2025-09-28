package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; // the String object corresponding to "여행" has become a garbage

        String kind1 = "자동차";
        String kind2 = kind1; // the address stored in kind1 variable has been assigned to kind2
        kind1 = null; // the String object corresponding to "자동차" is not a garbage
        System.out.println("kind2 : " + kind2);
    }
}
