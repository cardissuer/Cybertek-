package Objects;

public class DebitTest {
    public static void main(String[] args) {
        DebitCard db1 = new DebitCard (3751172435299L, "James", 30);
        db1.info();
        System.out.println();
        //DebitCard db2 = new DebitCard(5333333333333333L, "adam",300, "Mastercard","vi");
        //db2.info();
    }
}