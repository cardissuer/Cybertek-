package repl;

public class HWMethodsWithStringUniqueND {

//    uniqueChars is a method that you will code now, should be able to accept any string in the world
//    and return unique characters from the parameter.

    public static void main(String[] args) {
        //test your code
        System.out.println(uniqueChars("mamma"));
    }

    public static String uniqueChars(String str) {
            String temp = "";
            for (int i = 0; i < str.length(); i++) {
                if (temp.indexOf(str.charAt(i)) == -1) {
                    temp = temp + str.charAt(i);
                }
            }
            System.out.println(temp + " ");
            return temp;
        }
    }

    /*public static String uniqueChars(String str) {
        //to start a loop which will compare every character with all characters in word
        //set up a counter which will count a number of equals
        //if it's two or more, it will replace the second and other elements
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                 str =  str.replace(str.charAt(j), str.charAt(j));
                }
            }
        }
        System.out.println(str);
        return str;
    }
}*/