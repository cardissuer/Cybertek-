package tek;

public class task {
    public static void main(String[] args) {
        intRow(5);
    }

    public static void intRow(int number) {
        String temp = "";
        for (int i = 1; i <= number; i++) {
                temp = temp + " " + i;
            System.out.println(temp);
            }
        }
    }
