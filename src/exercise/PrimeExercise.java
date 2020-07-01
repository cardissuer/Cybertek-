package exercise;

import java.util.ArrayList;

public class PrimeExercise {

    public static boolean isPrimeNumber (int num){
        for (int i=2; i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static ArrayList <Integer> isPrimeRange (int range){
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i=2;i<=range;i++){
            if (isPrimeNumber(i)){
                prime.add(i);
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeRange(50));
    }
}
