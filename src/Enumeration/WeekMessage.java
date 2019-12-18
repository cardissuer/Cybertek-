package Enumeration;

public class WeekMessage {
    public static void main(String[] args) {
        Week.WeekDays day;
        day = Week.WeekDays.Sunday;
        getDay(day);
    }

    public static void getDay (Week.WeekDays day){
    switch (day){
        case Monday:
            System.out.println("Mondays are bad");
            break;
        case Tuesday:
            System.out.println("Regular day");
            break;
        case Wednesday:
            System.out.println("Regular day");
            break;
        case Thursday:
            System.out.println("Regular day");
            break;
        case Friday:
            System.out.println("Fridays are great");
            break;
        case Saturday:
            System.out.println("Weekends are the best");
            break;
        case Sunday:
            System.out.println("Weekends are the best");
            break;
    }
    }
}
