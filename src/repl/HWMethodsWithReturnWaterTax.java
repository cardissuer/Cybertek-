package repl;

public class HWMethodsWithReturnWaterTax {
    public static void main(String[] args) {
        //This method calculates a water bill, the method gets a double and returns a double.
        //
        //The more water you use the more it will cost you (as a fine for wasting water).
        System.out.println(waterTax(170));
    }

    public static double waterTax(double units) {
        double bill = 0.0;
        if (units < 50) {
            bill = units * 0.6;
        }
        if (units >= 50 && units < 100) {
            bill = units * 0.9;
        }
        if (units >= 100 && units < 150) {
            bill = units * 0.9 + 50;
        }
        if (units >= 150) {
            bill = units * 0.9 + 100;
        }
        return bill;
    }
}


