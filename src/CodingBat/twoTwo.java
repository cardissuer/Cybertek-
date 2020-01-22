package CodingBat;

public class twoTwo {

    public static void main(String[] args) {
        System.out.println(twoTwo(new int [] {2,2,2}));
    }

    public static boolean twoTwo(int[] nums) {
        int count = 0;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==2){
                count++;
            }
        }
        if (count%2==0) {
            return true;
        } return false;
    }
}