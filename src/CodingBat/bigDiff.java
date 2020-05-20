package CodingBat;

public class bigDiff {

    public static void main(String[] args) {
        System.out.println(bigDiff(new int[]{10,28,96,13,9}));
    }

    public static int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }
        return (max - min);
    }
}
