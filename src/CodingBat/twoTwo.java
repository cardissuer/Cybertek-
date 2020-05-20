package CodingBat;

public class twoTwo {

    public static void main(String[] args) {
        System.out.println(twoTwo(new int[]{1, 1, 4, 5, 6, 3, 1,}));
    }

    public static boolean twoTwo(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2)
                count++;
            else {
                if (count == 1)
                    return false;
                else
                    count = 0;
            }
        }
        return (count != 1);
    }
}
