package loop;

public class shapes {
    public static void main(String[] args) {
        for (int i=1;i<=8;i++) {
            for (int z=8-i;z>=0;z--) {
                System.out.print(" ");
            }
            for (int y=1+1; y<=i*2; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
