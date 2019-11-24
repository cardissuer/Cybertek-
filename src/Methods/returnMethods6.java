package Methods;

public class returnMethods6 {
    public static void main(String[] args) {

        //Write a method that will tell you if it is the weekday or not.
        // The method takes a String, Saturday and Sunday are the only weekend days

        System.out.println(weekDay("Saturday"));
    }

    public static boolean weekDay(String day) {
        day = day.toLowerCase();
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                return true;
            case "saturday":
            case "sunday":
                return false;
            default:
                System.out.println("invalid input");
                return false;
        }
    }
}

        /*if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            return true;
            if (day.equals("saturday") || day.equals("sunday")) {
                return ;
            }
        }
        return false;
    }
}*/
