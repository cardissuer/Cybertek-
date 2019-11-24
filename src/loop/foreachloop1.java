package loop;

import java.util.Arrays;

public class foreachloop1 {
    public static void main(String[] args) {
        int[] numbers = {4, 32, 6, 1, 8};

        //Traditional loop

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i]);
            }

            //For each loop

            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.print(number);
                }

                String [] names = new String [3];
                //System.out.println(Arrays.toString(names));
                names [0] = "james";
                names [1] = "bob";
                names [2] = "nemo";
                System.out.println(Arrays.toString(names));

                for (String name : names) {
                    if (name.contains("r")) {
                        System.out.println(name);
                    }
                }

            }
        }
    }
}
