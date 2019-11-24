package repl;

public class HWMethodsWithReturnProfitOrLoss {
    public static void main(String[] args) {
//c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
//it returns a string value that can be "profit","loss","no loss"
        System.out.println(result(200,200));
    }

    public static String result(int buyPrice, int sellPrice) {
        String result = "";
        if (buyPrice > sellPrice) {
            result = "loss";
        }
        if (buyPrice == sellPrice) {
            result = "no loss";
        }
        if (buyPrice < sellPrice){
            result = "profit";
        }
        return result;
    }
}
