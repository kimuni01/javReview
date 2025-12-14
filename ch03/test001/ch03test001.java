package ch03.test001;

public class ch03test001 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        // how many pencils per student
        int pencilsPerStudent = ( 534 / 30 );
        System.out.println(pencilsPerStudent);

        // how many pencils are remaining
        int pencilsLeft = ( 534 % 30 );
        System.out.println(pencilsLeft);


        int value = 356;
        System.out.println(value / 100 * 100);
        System.out.println((value) - (value % 100));


        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = ((lengthTop + lengthBottom) * height / 2.0);
        System.out.println(area);
        area = ((lengthTop + lengthBottom) * height * 1.0 / 2);
        System.out.println(area);
        area = ((double) (lengthTop + lengthBottom) * height / 2);
        System.out.println(area);
        //(lengthTop + lengthBottom) * height / 2.0
        //(lengthTop + lengthBottom) * height * 1.0 / 2
        //(double) (lengthTop + lengthBottom) * height / 2
        area = ((double) ((lengthTop + lengthBottom) * height / 2));
        System.out.println(area);


        int x = 10;
        int y = 5;
        System.out.println( (x > 7) && (y <= 5) );
        System.out.println( (x % 3 == 2) && (y % 2 != 1) );


        double x1 = 5.0;
        double y1 = 0.0;
        double z = 5 % y1;
        if (Double.isNaN(z)) {
            System.out.println("Cannot divide by 0.0.");
        } else {
            double result = z + 10;
            System.out.println("결과: " + result);
        }

        
    }
}
