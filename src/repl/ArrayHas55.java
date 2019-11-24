package repl;

import java.util.Scanner;

public class ArrayHas55 {
    public static void main(String[] args) {
        //Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array.
        // If no consecutive 5s or no 5s are detected in your code then print false.

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        boolean check = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5 && nums[i + 1] == nums[i]) {
                check=true;
                break;
            } else
                check = false;
            }
            System.out.println(check);
        }
    }

