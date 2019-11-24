package loop;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class nestedloops5 {

    public static void main(String[] args) {
        Random random = new Random();
        String number = "";  //125
        for(int i=0; i < 6; i++) {
            int ranNum = random.nextInt(10);
//            if(number.contains(ranNum+ "")) {
//                ranNum = random.nextInt(10);
//            }
            while(number.contains(ranNum + "")) {
                ranNum = random.nextInt(10);
            }
            number += ranNum;
        }
        System.out.println(number);
    }
}





