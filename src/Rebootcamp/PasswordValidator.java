package Rebootcamp;

public class PasswordValidator {

    public static void main(String[] args) {
        String password = "dfljo580wnasdFksafn&";
        boolean length = password.length()>=8;
        boolean lower = password.matches(".*[a-z].*");
        boolean upper = password.matches(".*[A-Z].*");
        boolean number = password.matches(".*[1-9].*");
        boolean special = password.matches(".*[!@#$%^&*.,?].*");
        boolean valid = length&&lower&&upper&&number&&special;
        System.out.println(valid?"Password is valid":"Password is not valid");
        }
    }