package CodingBat;

public class centeredAverage {

    public static void main(String[] args) {
        System.out.println(centeredAverage(new int []{2,5,4,6,10}));
    }

    public static int centeredAverage(int[] nums) {
    int max = nums[0];
    int min = nums[0];
    int sum = nums[0];
    for (int i=1;i<nums.length;i++){
        sum+=nums[i];
        if (nums[i]>max){
            max = nums [i];
        } else if (nums[i]<min){
            min = nums[i];
        }
    }
    return (sum - max- min) / (nums.length-2);
    }
}
