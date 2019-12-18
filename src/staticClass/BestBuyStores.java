package staticClass;

public class BestBuyStores {

    public static void main(String[] args) {
        BestBuy storeOne = new BestBuy();
        BestBuy storeTwo = new BestBuy();

        System.out.println(storeOne.numOfComputers);
        storeOne.numOfComputers-=10;
        System.out.println(storeTwo.numOfComputers);
    }
}