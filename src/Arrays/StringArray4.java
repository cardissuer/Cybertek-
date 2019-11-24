package Arrays;

public class StringArray4 {
    public static void main(String[] args) {
        //Part II * Modify the loop and print the player names whose name ends with "s"
        String[] names = {"James", "Sam", "Adam", "Elize", "Jamie", "Benzema", "Sandy"};
        for (int i = 0; i < names.length; i++) {
            if (names[i].toLowerCase().endsWith("s")) {
                System.out.println(names[i]);
            }
        }
    }
}