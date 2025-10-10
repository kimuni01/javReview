package ch06.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        // creating a Computer object
        Computer myCom = new Computer();

        // when calling sum() method, provide arguments 1, 2, 3
        // then assign sum result to result1 variable
        int result1 = myCom.sum(1, 2, 3);
        System.out.println("result1 : " + result1);

        // when calling sum() method, provide argument 1, 2, 3, 4, 5
        // then assign sum result to result2 variable
        int result2 = myCom.sum(1, 2, 3, 4, 5);
        System.out.println("result2 : " + result2);

        // when calling sum() method, provide an array
        // then assign sum result to result3 variable
        int[] values = {1, 2, 3, 4, 5};
        int result3 = myCom.sum(values);
        System.out.println("result3 : " + result3);

        // when calling sum() method, provide an array
        // then assign sum result to result4 variable
        int result4 = myCom.sum(new int[] {1, 2, 3, 4, 5});
        System.out.println("result4 : " + result4);
    }
}
