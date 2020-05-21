package Rebootcamp;

public class Finra {
    public static void main(String[] args) {
//        for (int i = 1; i <= 30; i++) {
//            if (i % 3 == 0) {
//                System.out.println("FIN");
//            }
//            if (i % 5 == 0) {
//                System.out.println("RA");
//            }
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FINRA");
//            } else System.out.println(i);
//        }
        FINRA(30);
    }

    public static void FINRA (int num){
        for (int i=1; i<=num;i++){
            String print = "";
            if (i%3==0) print += "FIN";
            if (i%5==0) print += "RA";
            if (print.isEmpty()){
                System.out.println(i);
            } else{
                System.out.println(print);
            }
        }
    }
}