package Strings;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        String word = "Cybertek";
        System.out.println(word.equals(word + "Other word"));
        System.out.println(word.length());
        System.out.println(word.isEmpty());
        System.out.println(word.contains("Cyber"));
    }
}
