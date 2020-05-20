package CodingBat;

public class tripleUp {

    public static void main(String[] args) {
        System.out.println(tripleUp(new int [] {1,4,3,8,7,6}));
    }

    public static boolean tripleUp(int[] nums) {
        for (int i=0; i<nums.length-2; i++){
            if ((nums[i]+1==nums[i+1])&&(nums[i]+2==nums[i+2])) return true;
        } return false;
    }

}
