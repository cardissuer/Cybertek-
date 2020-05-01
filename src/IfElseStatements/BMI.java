package IfElseStatements;
import java.util.*;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your mass in kg");
        double mass = input.nextDouble();
        System.out.println("Enter your height in meters");
        double height = input.nextDouble();
        double result = mass / (height * height);
        System.out.println(result);

        if (result < 18.5) {
            System.out.println("Underweight");
        } else if (result >= 18.5 && result < 25) {
            System.out.println("Normal weight");
        } else if (result >= 25 && result < 30) {
            System.out.println("Overweight");
        } else
            System.out.println("Obese");
        }
    }

