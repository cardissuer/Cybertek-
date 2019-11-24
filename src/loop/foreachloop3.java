package loop;

public class foreachloop3 {
    public static void main(String[] args) {
        //Given a String array with value of:
        //"Bread", "cucumber", "Apples", "Orange", "cookies", “Cake"
        //Print out how many of the words begin with uppercase letters

        String [] words = {"Bread", "cucumber", "Apples", "Orange", "cookies", "Cake"};
        int count = 0;
        for (String word : words) {
            char start = word.charAt(0);
            if (start>=65 && start<=90) {
                count++;
            }
        }
        System.out.println(count);
    }
}
