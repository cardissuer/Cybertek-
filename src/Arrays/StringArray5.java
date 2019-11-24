package Arrays;

public class StringArray5 {
    public static void main(String[] args) {
        //Part III * Modify and print the player if it contains "s"
        String [] names = {"James", "Sam", "Adam", "Elize", "Jamie", "Benzema", "Sandy"};
        for (int i=0; i < names.length; i++ ) {
            if (names[i].contains("s")){
                System.out.println(names[i]);
            }
        }
    }
}
