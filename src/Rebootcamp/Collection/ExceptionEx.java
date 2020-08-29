package Rebootcamp.Collection;

import java.util.NoSuchElementException;

public class ExceptionEx {
    public static void main(String[] args) {
        try{
            String a = "java";
            System.out.println(a.substring(1));
            System.out.println(4/0);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block");
        }
    }
}
