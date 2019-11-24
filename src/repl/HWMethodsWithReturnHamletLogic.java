package repl;

public class HWMethodsWithReturnHamletLogic {
    public static void main(String[] args) {
//The danish prince most famous quote is "to be or not to be". thats a classic example of boolean logic.
//
//the hamletQuote method only returns true if one of  or both of the boolean parameters is true.

        System.out.println(hamletQuote(true,false));
    }
    public static boolean hamletQuote (boolean toBe, boolean notToBe){
        if (toBe==false && notToBe==false){
            return false;
        }
        return true;
    }
}
