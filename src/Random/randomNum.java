package Random;

import java.util.Random;

public class randomNum {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
    }
}
