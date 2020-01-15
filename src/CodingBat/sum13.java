package CodingBat;

public class sum13 {

    public static void main(String[] args) {
        System.out.println(sum13(new int[]{24, 2, 4, 13, 5, 7, 13, 20,10}));
    }

    public static int sum13(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
            if (nums[i] == 13) {
                i++;
             result = result-13;
             continue;

            }
        }
        return result;
    }
}