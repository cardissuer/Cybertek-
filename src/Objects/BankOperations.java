package Objects;

public class BankOperations {
    public static void main(String[] args) {

        BankAccount myBank = new BankAccount();
        myBank.holderName = "Obama";
        myBank.accountNumber = 42352;
        myBank.type = "Business";
        myBank.balance = 3200;

        myBank.info();
        myBank.deposit(5000.00);
        myBank.info();
        myBank.transfer(7000);
        myBank.info();
        myBank.transfer(1300);
        myBank.info();
    }
}
