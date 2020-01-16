package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetExercise {

    public static void main(String[] args) {

        Set <Integer>numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");

        Integer one = scanner.nextInt();
        Integer two = scanner.nextInt();
        Integer three = scanner.nextInt();
        Integer four = scanner.nextInt();
        Integer five = scanner.nextInt();

        numbers.add(one);
        numbers.add(two);
        numbers.add(three);
        numbers.add(four);
        numbers.add(five);

        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()){
            Integer number = it.next();
            if (number == one || number == three || number == five){
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}