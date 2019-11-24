package repl;

public class HWMethodsWithReturnCountAppearance {
//    Create a method that gets an array of strings and a string, the method returns an int.
//    It counts how many times a string appears in the array and returns the count
public static void main(String[] args) {
    String[]arr = {"basic", "best", "real", "basic"};
    System.out.println(count_appearance(arr, "best" ));
}
    public static int count_appearance(String[] arr,String t) {
        int count = 0;
        for (int i=0; i<arr.length;i++){
            if (arr[i].equals(t)){
                count++;
            }
            continue;
        }
return count;
    } //end  count_appearance
}

