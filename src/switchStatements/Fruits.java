package switchStatements;

public class Fruits {
    public static void main(String[] args) {

        String fruit = "apple";

                switch (fruit) {
                    case "oranges":
                        System.out.println("Oranges are sweet");
                        break;
                    case "banana":
                    case "apple":
                        System.out.println("My favourite ");
                        break;
                    default:
                        System.out.println("Not a fruit");

                }
    }
}
