package Hackerrank;

import java.util.List;

public class PriceCheckNewHaven {

    public static void main(String[] args) {
    }

    public static int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice) {
        // Write your code here
        int count = 0;
        for (int j = 1; j < productSold.size(); j++) {
            for (int i = 1; i < products.size(); i++) {
                if (productSold.get(j).equalsIgnoreCase(products.get(i))) {
                    if (productPrices.get(i) % soldPrice.get(j) != 0) {
                        count++;
                        continue;
                    }
                }
            }
        }
        return count;
    }
}
