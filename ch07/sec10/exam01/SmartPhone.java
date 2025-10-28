package ch07.sec10.exam01;

public class SmartPhone extends Phone {
    // declaring constructor
    SmartPhone(String owner) {
        // calling Phone constructor
        super(owner);
    }

    //declaring method
    void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
