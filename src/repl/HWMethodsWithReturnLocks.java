package repl;

import javax.swing.*;

public class HWMethodsWithReturnLocks {
    public static void main(String[] args) {
        System.out.println(threeLocks(true, false, false));
    }
    public static boolean threeLocks (boolean a, boolean b, boolean c) {
        boolean result;
        if (a == true && b == true || c==true) {
            result = true;
        } else {
        result = false;
        }
        return result;
    }
}
