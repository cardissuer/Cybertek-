package Methods;

public class voidMethods4 {
    public static void main(String[] args) {
        goTo(" London", " China");
        makeEmail("james", "bond", 25);
    }
    public static void goTo (String origin, String newLocation) {
        System.out.println("You start here" + origin);
        System.out.println("You go to new location" + newLocation);
    }
    public static void makeEmail (String firstName, String lastName, int age) {
        String email = firstName + age + lastName + "@cybertek.com";
        System.out.println(email);

    }
}
