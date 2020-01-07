package Exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassTwo {
    public static void main(String[] args) {
        /*try {
            String s = "hello";
            System.out.println(s.charAt(1));
            System.out.println(3/0);
        } catch (StringIndexOutOfBoundsException | InputMismatchException | NullPointerException e) {
            System.out.println("Index does not exist");*/

            ArrayList <Integer> numbers = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            for ( ; ;){

                try{
                    System.out.println("Enter a number");
                    numbers.add(scanner.nextInt());
                } catch (InputMismatchException e){
                    break;
                }
            }
            System.out.println(numbers);
        }
    }

