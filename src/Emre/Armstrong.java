package Emre;

public class Armstrong {
    public static void main(String[] args) {
        armstrong(153);
    }
    public static void armstrong(int number){
        String num=number+"";
        int power=num.length();
        int sum=0;
        for(int i=0; i<num.length();i++){
            int digit=Integer.parseInt(num.charAt(i)+"");
            sum +=Math.pow(digit,power);
        }
        if(number==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}
