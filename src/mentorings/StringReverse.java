package mentorings;

public class StringReverse {
    public static void main(String[] args) {
        String s = "funk";
        char [] arr = s.toCharArray();
        for (int i=0;i<s.length()/2;i++){
            char temp = arr[i];
            arr[i] = arr [arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        String reversed = new String(arr);
        System.out.println(reversed);
    }
    //public static void reverseStringValueSwap (String s) (...);
    //public static void reverseStringTraditional (String s) (...);
    public static String reverseStringWithStringBuilder (String s) {
        return new StringBuilder (s).reverse().toString();
    }
}