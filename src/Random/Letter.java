package Random;

//Give a random uppercase letter using ASCII table

import java.util.Random;

public class Letter {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(26);
        number+=65;
        char c = (char) (number);
        System.out.println("My number is " + number);
        System.out.println("My letter is " + c);
    }
}
