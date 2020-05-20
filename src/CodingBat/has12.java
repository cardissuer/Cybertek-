package CodingBat;

public class has12 {

    public static void main(String[] args) {
        System.out.println(has12(new int[]{1, 3, 4, 5, 6, 7, 2}));
    }

    public static boolean has12(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = nums[i]; j < nums.length; j++) {
                    if (nums[j] == 2) return true;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                for (int j = nums[i]; j < nums.length; j++) {
                    if (nums[j] == 1) return true;
                }
            }
        }
        return false;
    }
}
