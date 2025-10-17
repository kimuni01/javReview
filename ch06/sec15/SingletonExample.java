package ch06.sec15;

public class SingletonExample {
    public static void main(String[] args) {
        /*
         * Singleton obj1 = new Singleton(); // compiler error
         * Singleton obj2 = new Singleton();
         */
        
         // getting a singleton object by calling a static method
         Singleton obj1 = Singleton.getInstance();
         Singleton obj2 = Singleton.getInstance();

         // check if they refer the same object
         if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
         }
         else {
            System.out.println("다른 Singleton 객체입니다.");
         }
    }
}
