package Methods;

public class returnMethods7 {

//Create a method that will count how many even numbers there is from the given array and return the value
public static void main(String[] args) {
int [] arr = {3,4,7,34,65,2,9,30};
    System.out.println(evenNumbersCount(arr));
}

public static int evenNumbersCount (int [] nums) {
    int count = 0;
    for (int num: nums) {
        if (num % 2 == 0) {
            count++;
        }
    }
    return count;
}
}
