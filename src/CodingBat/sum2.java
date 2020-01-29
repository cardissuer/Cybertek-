package CodingBat;

public class sum2 {

    public static void main(String[] args) {
        System.out.println(sum2(new int[] {}));
    }

    public static int sum2(int[] nums) {
        int sum=0;
        if (nums.length>1) {
            sum = nums[0]+nums[1];
        } else if (nums.length==1){
            sum=nums[0];
        } else {
            sum=0;
        }
        return sum;
    }
}
