package repl;

public class HWMethodsWithStringMergeND {
    public static void main(String[] args) {

        System.out.println(mergeStrings("jesus", "christ"));
    }

    public static String mergeStrings(String one, String two) {
//When gears merge and work together, one teeth from each one goes in order.
//Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.
// Please note one and two can be of different lengths. Please look at below examples:
        StringBuilder result = new StringBuilder();

        //if (one.length() == two.length()) {
          //  for (int i = 0; i < two.length(); i++) {
            //    result = result + one.charAt(i) + two.charAt(i) + "";
            //}
                for (int i = 0; i < one.length() || i<two.length(); i++) {
                    if (i<one.length()){
                    result.append(one.charAt(i));
                        if (i<two.length()){
                            result.append(two.charAt(i));
            }
            }
        }
        return result.toString();
    }
}
