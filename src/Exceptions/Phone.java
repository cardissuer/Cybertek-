package Exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Phone {

    int [] nums;
    double version;
    String brand;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone phone = new Phone();
        try {
            System.out.println("Please enter phone version");
            phone.version = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Invalid version entered");
        }
        System.out.println("Please enter brand name ");
        phone.brand = scanner.nextLine();

            System.out.println("Enter lines amount");
            int[] nums = new int[scanner.nextInt()];
            scanner.nextLine();

            for (int i = 0; i < nums.length; i++) {
                try{
                System.out.println("Please enter number " + (i + 1));
                nums[i] = scanner.nextInt();
            } catch (InputMismatchException e){
                    System.out.println("Invalid number, enter again");
                   // i--;
                    // continue;
                }
            }

            phone.nums = nums;
        System.out.println(phone.version);
        System.out.println(phone.brand);
        System.out.println(Arrays.toString(phone.nums));
        }
        }