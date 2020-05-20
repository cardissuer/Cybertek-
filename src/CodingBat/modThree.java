package CodingBat;

public class modThree {

    public static void main(String[] args) {
        System.out.println(modThree(new int[]{2, 1, 2, 5}));
    }

    public static boolean modThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) || (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1))
                return true;
        }
        return false;
    }

//    public boolean modThree(int[] nums)
//    {
//        for(int i = 0; i < nums.length - 2; i++)
//        {
//            if(nums[i] % 2 == nums[i+1] % 2 && nums[i] % 2 == nums[i+2] % 2)
//                return true;
//        }
//        return false;
//    }

}
