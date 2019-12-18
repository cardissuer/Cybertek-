package Enumeration;

public class CalculatorMethod {
    public static void main(String[] args) {
        Calculator.CalcSymbols type;
        type = Calculator.CalcSymbols.PLUS;
        getResult("MULTIPLE",5,6);
    }

    public static void getResult (String type, double a,double b){
        switch (type) {
            case "PLUS":
                System.out.println((a + " + " + b + " = " + (a+b)));
                break;
            case "MINUS":
                System.out.println((a + " - " + b + " = " + (a-b)));
                break;
            case "MULTIPLE":
                System.out.println((a + " * " + b + " = " + (a*b)));
                break;
            case "DIVIDE":
                System.out.println((a + " / " + b + " = " + (a/b)));
                break;
            case "MODULUS":
                System.out.println((a + " / " + b + " = " + (a/b)));
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
