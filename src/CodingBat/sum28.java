package CodingBat;

public class sum28 {

    public static void main(String[] args) {
        System.out.println(sum28(new int [] {2,4,3,2,6,7,4,5,6,10}));
    }

    public static boolean sum28(int[] nums) {
        int sum = 0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == 2) {
                sum += nums[i];
            }
        }
        if (sum==8){
            return true;
        } return false;
    }
}