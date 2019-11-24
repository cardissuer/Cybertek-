package Methods;

public class returnMethods4 {

    //Create a method that will accept a String and will reverse your String. Return the reversed String.

    public static String reversal (String straight, String reversed) {
        for (int i=straight.length()-1; i>=0; i--) {
           reversed += straight.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reversal("united", ""));
    }
}