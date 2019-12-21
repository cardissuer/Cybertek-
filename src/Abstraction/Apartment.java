package Abstraction;

public abstract class Apartment extends Home {

    @Override
    public void throwParty() {
        System.out.println("Throw a party in apartment ");
    }

    @Override
    public void lock() {
        System.out.println("Locking an apartment ");
    }

    @Override
    public void unlock() {
        System.out.println("Unloicking the apartment ");
    }

    @Override
    public void cook() {
        System.out.println("Cooking in apartment ");
    }
}