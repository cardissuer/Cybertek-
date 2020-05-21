package Rebootcamp;

import java.util.ArrayList;

public class PrimeMethod {

    public static void main(String[] args) {
        System.out.println(Prime(30));
        System.out.println(primeNumber(30));
    }

    public static ArrayList <Integer> Prime (int num) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if (i % i == 0 && i % 1 == 0) primeNumbers.add(i);
        }
        return primeNumbers;
    }

    public static String primeNumber (int range){
        String numbers="";
        for (int i=2; i<=range;i++){
            boolean check=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    check=false;
                    break;
                }
            }
            if (check){
                numbers+=i+ " ";
            }
        }
        return numbers;
    }
}