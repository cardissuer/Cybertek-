package Arrays;

import java.util.Arrays;

public class twoDArrays3 {
    public static void main(String[] args) {
        String [][] names = new String [3][4];
        String [] name = {"Hello", "Goodbye", "Yes", "No"};
        String [] name1 = {"Thank", "you"};
        String [] name2 = {"Old", "Brown", "Shoe"};
            names[0] = name;
            names[1] = name1;
            names [2] = name2;
        System.out.println(Arrays.deepToString(names));}
    }
