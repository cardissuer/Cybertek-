package CodingBat;

public class repeatFront {

    public static void main(String[] args) {
        System.out.println(repeatFront("Jason", 4));
    }

    public static String repeatFront(String str, int n) {
    String newWord = "";
    int a = n;
    for (int i=0; i<n;i++){
        newWord += str.substring(0,a);
        a--;
    }return newWord;
    }
}
