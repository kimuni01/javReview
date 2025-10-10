package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        // creating a Calculator object
        Calculator myCalc = new Calculator();

        // calling the powerOn() method without return value
        myCalc.powerOn();

        // when calling plus() method, provide 5 and 6 as parameters
        // then assign the adding result to result1 variable
        int result1 = myCalc.plus(5, 6);
        System.out.println("result1 : " + result1);

        int x = 10;
        int y = 4;
        // when calling divide() method, provide variable x and y values as
        // parameters, then assign the division result to result2 variable
        double result2 = myCalc.divide(x, y);
        System.out.println("result2 : " + result2);

        // call the powerOff() method without return value
        myCalc.powerOff();
    }
    
}
