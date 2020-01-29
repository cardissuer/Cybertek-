package CodingBat;

public class has23 {
    public static void main(String[] args) {
        System.out.println(new int[]{2,3,4,5,6,7});
    }
    public static boolean has23(int[] nums) {
        for (int num: nums){
            if (num==2 || num==3) {
                return true;
            }
        } return false;
    }
}
