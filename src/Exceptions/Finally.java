package Exceptions;

public class Finally {

    public static void main(String[] args) {
        String s = "cybertek";
        try{
            System.out.println(s.substring(10));
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Index doesn't exist");
        } finally {
            System.out.println("The string was " + s);
            throw new RuntimeException();
        }
    }
}