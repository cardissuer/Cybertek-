package CodingBat;

public class sum67 {

    public static void main(String[] args) {
        System.out.println(sum67(new int [] {2,3,4,5,6,8,9,10,7,1,2}));
    }

    public static int sum67(int[] nums) {
    int sum = nums[0];
    boolean six = false;
    for (int i=0; i<nums.length;i++) {
        if (six){
            if (nums[i]==7) six = false;
        } else if (nums[i]==6) six = true;
        else sum+=nums[i];
    }
    return sum;
    }
}
