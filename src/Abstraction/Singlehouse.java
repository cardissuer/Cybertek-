package Abstraction;

public abstract class Singlehouse extends Home {

    String garageType;

    @Override
    public void throwParty() {
        System.out.println("Throw a party in single house ");
    }

    @Override
    public void lock() {
        System.out.println("Locking a single house ");
    }

    @Override
    public void unlock() {
        System.out.println("Unlocking a single house");
    }

    @Override
    public void cook() {
        System.out.println("Cooking in single house");
    }

    @Override
    public String toString() {
            String result = "garageType='" + this.garageType + "Address" + this.address + "Number of rooms" + this.numOfRooms + "Guests number is " + this.numOfGuests;
            return result;
        }

    public void cutGrass () {
        System.out.println("Grass is cut ");
    }

    public void shovelSnow () {
        System.out.println("Snow is shovelled ");
    }
}