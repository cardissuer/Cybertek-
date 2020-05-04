package CodingBat;

public class catDog {

    public static void main(String[] args) {
        System.out.println(catDog("catdogcat"));
    }

    public static boolean catDog(String str) {
        int dogcount = 0;
        int catcount = 0;
        boolean count = true;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("dog")) {
                dogcount++;
            }
            if (str.substring(i, i + 3).equals("cat")) {
                catcount++;
            }
        }
        if (catcount == dogcount) {
            return count;
        } else return count == false;
    }
}

