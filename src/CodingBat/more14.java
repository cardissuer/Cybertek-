package CodingBat;

public class more14 {

    public static void main(String[] args) {
        System.out.println(more14(new int [] {1,4,4}));
    }

    public static boolean more14(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==1) {
                count1++;
            } if (nums[i]==4) {
                count2++;
            }
        }if (count1>count2){
            return true;
        } return false;
    }
}
