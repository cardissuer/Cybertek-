package Objects;

public class BankAccount {

    //2. Create a class BankAccount
    //Instance variables: type, accountNumber, balance,
    //holderName
    // Methods:
    //deposit. Method accepts double and it doesn’t return anything. Method should simply print “%double is deposited to your account” and add given double to the balance.
    //transfer -> accepts double -> Method should print “%double $ is transferred from your account” and decrement balance by given amount.
    //info -> Method doesn’t accept or return anything. It should simply print the information about the BankAccount as below format
    //Name: %holderName
    //Balace: %balance
    //Type: %type
    //Account Number: %accountNumber

    String type;
    int accountNumber;
    double balance;
    String holderName;

    public void deposit(double addSum){
        this.balance+=addSum;
        System.out.println(addSum + " is deposited to your account");
    }
    public void transfer (double moneyTransfer){
        if (this.balance>=moneyTransfer) {
            balance -= moneyTransfer;
            System.out.println(moneyTransfer + " is transferred from your account");
        }else{
            System.out.println("Not sufficient funds");
        }
    }
    public void info(){
        System.out.println("\nName: " + this.holderName);
        System.out.println("Balance: " + this.balance);
        System.out.println("Type: " + this.type);
        System.out.println("Account Number: " + this.accountNumber);
    }
}