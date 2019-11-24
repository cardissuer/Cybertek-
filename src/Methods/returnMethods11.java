package Methods;

public class returnMethods11 {
    //Create a calculator method that will take three arguments: an
    //operator ( +, -, *, \, %)  and two numbers.
    // Perform that operation between the two numbers and return the result

    public static void main(String[] args) {
        System.out.println(result(5,4,"*"));
    }
    public static int result (int num1, int num2, String oper) {
        int res;
        switch (oper) {
            case "+":
                return num1+num2;
            case "-":
                return num1-num2;
            case "*":
                return num1*num2;
            case "/":
                return num1/num2;
            case "%":
                return num1%num2;
            default:
                System.out.println("invalid input");
                return 0;
        }
    }
}