package ch05.sec12;

import java.util.Calendar; // Calender is in java.util package

public class WeekExample {
    public static void main(String[] args) {
        // declaring enum type Week variable
        Week today = null;

        // getting Calendar
        Calendar cal = Calendar.getInstance();

        // getting today's day of the week(1 ~ 7)
        int week = cal.get(Calendar.DAY_OF_WEEK);

        // convert number into enum type constant then assign to a variable
        switch(week) {
            case 1 : today = Week.SUNDAY;   break;
            case 2 : today = Week.MONDAY;   break;
            case 3 : today = Week.TUESDAY;  break;
            case 4 : today = Week.WEDNESDAY;break;
            case 5 : today = Week.THURSDAY; break;
            case 6 : today = Week.FRIDAY;   break;
            case 7 : today = Week.SATURDAY; break;
        }

        // use the enum type variable
        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다.");
        }
        else { 
            System.out.println("열심히 자바를 공부합니다.");
        }
    }
}
