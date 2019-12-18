package MethodOverriding;

public class SavingsAccount extends BankAccount{

    double interestIncome;

    @Override
    public void transfer(double transfer) {
        super.transfer(transfer);
            balance -= transfer + (transfer*0.2);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Interest income is: " + this.interestIncome);
    }

    public void calculateInterestIncome (){
        this.interestIncome += this.balance*1.03;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestIncome=" + this.interestIncome +
                ", balance=" + this.balance +
                ", accountNumber=" + this.accountNumber +
                ", name='" + this.name + '\'' +
                '}';
    }
}