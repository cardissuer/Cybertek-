package variables;

public class task {

    public static void main(String[] args) {
int a=5;
int b=2;

        System.out.println( a/b);
        System.out.println(a%b);

        int sum=a+b;
        int minus=a-b;
        a=a-1;
        b=b/2;
        System.out.println(sum + minus);

        a=a-1;
        a-=1;
        b=b/2;
        b/=2;

        int total =15+23+367;
        int avg =total/3;
        System.out.println(avg);

        double Fahr = 72.5;
        double form = 5*(Fahr-32)/9;
        System.out.println(form);
    }
}
