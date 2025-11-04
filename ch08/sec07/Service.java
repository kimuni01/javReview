package ch08.sec07;

public interface Service {
    // default methods
    default void defaultMethod1() {
        System.out.println("defaultMethod1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2 종속 코드");
        defaultCommon();
    }

    // private method
    private void defaultCommon() {
        System.out.println("defaultMethod 중복 코드 A");
        System.out.println("defaultMethod 중복 코드 B");
    }

    // static methods
    static void staticMethod1() {
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }
    
    static void staticMethod2() {
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    // private static method
    private static void staticCommon() {
        System.err.println("staticMethod 중복 코드 C");
        System.out.println("staticMethod 중복 코드 D");
    }
}
