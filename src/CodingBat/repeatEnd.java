package CodingBat;

public class repeatEnd {

    public static void main(String[] args) {
        System.out.println(repeatEnd("Jason", 3));
    }

        public static String repeatEnd(String str, int n) {
            String newWord = "";
            for (int i=0; i<n; i++){
            newWord += str.substring(str.length()-n);
        } return newWord;
        }
    }
