package Methods;

public class overloadingMethods3 {

    //Create a method that takes a String, it will print the first characters
    //Then overload the method to take a String, and an index.
    // And print the character found at that index
    //Then overload the method to take a String and two numbers.
    // Take the substring of the String based on the two numbers provided.
    // Return the length of the substring String

    public static void main(String[] args) {
        System.out.println(pri("Misunderstanding", 2, 5));
    }

    public static void pri(String name, int index) {
        System.out.println(name.charAt(index));
    }

    public static int pri (String name, int num1, int num2) {
        return name.substring(num1,num2).length();
    }
}