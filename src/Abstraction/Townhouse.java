package Abstraction;

public abstract class Townhouse extends Home {

    @Override
    public void throwParty() {
        System.out.println("Throw a party in townhouse ");
    }

    @Override
    public void lock() {
        System.out.println("Locking a townhouse ");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking a townhouse ");
    }

    @Override
    public void cook() {
        System.out.println("Cooking at townhouse ");
    }

    public void shareWithNeighbor (){
        System.out.println("Home is shared with neighbor ");
    }
}
