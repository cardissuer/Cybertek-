package Rebootcamp;

public class Countletters {

    public static void main(String[] args) {
        String str = "java";
        String check = "";
        for (int i=0; i<str.length();i++){
            if (check.contains(str.charAt(i) + "")) continue;
            int count = 0;
            for (int j=0; j<str.length();j++){
                if (str.charAt(i)==str.charAt(j)) count++;
            }
            System.out.println(str.charAt(i) + " was found " + count + " times");
            check += str.charAt(i);
        }
    }
}
