package CodingBat;

public class has22 {

    public static void main(String[] args) {
        System.out.println(has22(new int [] {2,2,4,5,6,2}));
    }

    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2) {
                return true;
            }
        }return false;
    }
}
