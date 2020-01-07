package Emre;

public class SwapTwoNumber {
    public static void main(String[] args) {
        swapTwoNumbers(9,5);
        swapTwoNumbers2(22,54);
    }
    public static  void swapTwoNumbers(int a,int b){
        // a=10 b=20  // a=20 b=10
        a=a+b;  // a=30;
        b=a-b;  // 30-20=10
        a=a-b;  // 30-10=20
        System.out.println(a +" " + b);
    }
    public static  void swapTwoNumbers2(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a +" " + b);
    }
}

