package Arrays;

public class StringArrayIfContains1 {
    public static void main(String[] args) {

        //Given a Strings of
        // "Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", “Fran2113gmailcom", “JamieM@yahoo.com"
        //Print all the emails that are valid. A valid email has the ‘@‘ sign that comes before the ‘.’

        String[] email = {"Jamesbond3@gmail.com", "notvalid@.com", "Adam5@yahoo.com", "Fran2113gmailcom", "JamieM@yahoo.com" };
        for (int i = 0; i < email.length; i++) {
            if (email[i].contains("@") && email[i].contains(".")) {
                int at = email[i].indexOf("@");
                int dot = email[i].indexOf(".");

                if (at < dot) {
                    System.out.println(email[i] + " Valid");
                } else
                    System.out.println(email [i] + " Invalid");
            } else
                System.out.println(email[i] + " Invalid");
        }
    }
}