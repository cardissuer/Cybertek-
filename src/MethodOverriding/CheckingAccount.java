package MethodOverriding;

public class CheckingAccount extends BankAccount{

    @Override
    public void transfer(double transfer) {
        super.transfer(transfer);
        if (balance>transfer*1.05){
            balance -= transfer + (transfer*0.05);
            System.out.println("Transfer successful");
        }
            System.out.println("Not sufficient funds");
        }

    @Override
    public String toString() {
        return super.toString();
    }
}