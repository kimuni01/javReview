package ch08.sec07;

public class ServiceExample {
    public static void main(String[] args) {
        // declaring interface variable THEN assining implementing object
        Service service = new ServiceImpl();

        // calling default methods
        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();
        
        // calling static methods
        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
    }
}
