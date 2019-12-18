package Methods;

public class GurhanPalindrome {
    public static void main(String[] args) {
        isPalindrome("civic");
    }
    public static boolean isPalindrome (String word){
        String reverse = "";
            for (int i=word.length()-1;i>=0;i--){
           reverse = reverse + word.charAt(i);
           }if (word.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
                return true;
            }
        System.out.println("Not a palindrome");
        return false;
        }
    }