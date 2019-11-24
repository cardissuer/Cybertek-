package Methods;

public class returnMethods5 {

    //Create a method that will take a String as a parameter and return if the String is palindrome or not

    public static boolean palin(String name) {
        String name2 = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            name2 += name.charAt(i);
            if (name.equals(name2)) {
            return true;
            }
        }
        return false;
    }
    public static boolean isPalindromeArr (String str) {
        char [] arr = str.toLowerCase().toCharArray();
        for (int i=0; i<arr.length/2;i++) {
            if (arr[i] != arr[arr.length-1-i]) {
                return false;
            }
        }
        return true;
    }
        public static void main (String[]args){
            System.out.println(palin("civic"));
            System.out.println(isPalindromeArr("james"));
        }
    }