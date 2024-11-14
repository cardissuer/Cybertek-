package Test;

public class Test {
    public static void main(String[] args) {
//       Test test = new Test();
//        test.ex(12);
        String word = "{{{}}}";
        System.out.println(CurlyBraces(word));
//        System.out.println(test);
    }

    public void ex(int num) {
        int number = num;
        System.out.println(number);
    }

    public static boolean Palindrome2Indexez(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;

    }

    public static boolean CurlyBraces (String word){
        int sumLeft = 0;
        int sumRight = 0;
        for (int i=0; i<word.length()-1;i++){
            if (word.charAt(i) == '{') sumLeft++;
            if (word.charAt(i) == '}') sumRight++;
        }
        if (sumLeft == sumRight) return true;
        return false;
    }
// 1 variable + make sure that is starts from Left and close with Right - TO THINK!
}