package WrapperClass;

import java.util.ArrayList;
import java.util.Random;

public class MagicNumber {
    ArrayList <Integer> numbers = new ArrayList<>();

    public void generateNumbers (int size){
        Random random = new Random();
        for (int i=0;i<size;i++){
            numbers.add(random.nextInt(1000));
        }
    }
    public static void main(String[] args) {
        MagicNumber mn = new MagicNumber();
        mn.generateNumbers(10);
        System.out.println(mn.numbers);
        MagicNumber mnEven = new MagicNumber();
        mnEven.generateEvens(10);
        System.out.println(mnEven.numbers);
    }

    public void generateEvens (int size){
        Random random = new Random();
        //numbers.clear();
        while (true){
        int num = random.nextInt(100);
            if (num%2==0){
                numbers.add(num);
            }
            if (numbers.size() == size){
                break;
            }
        }
    }
}