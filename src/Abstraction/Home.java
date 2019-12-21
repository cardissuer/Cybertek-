package Abstraction;

//Abstract class Home.
//Instance variables: numOfRooms, address, maxNumOfGuests;
//Methods: throwParty, lock, unlock, cook.
//Override toString method. Build and return all info about Home.
//   Concrete classes: Apartment, Townhouse, SingleHouse.
//Townhouse additional methods: shareWithNeighbor.
//SingleHouse additional methods: cutGrass, shovelSnow.
//SingleHouse additional variable: garageType.
//Override toString method and include garageType info.

public abstract class Home {
    int numOfRooms;
    String address;
    int numOfGuests;

    public abstract void throwParty ();

    public abstract void lock ();

    public abstract void unlock ();

    public abstract void cook ();

    @Override
    public String toString() {
        String result = "Address" + this.address + "Number of rooms" + this.numOfRooms + "Guests number is " + this.numOfGuests;
    return result;
    }

    public void info (){
        System.out.println("Home address is " + address);
        System.out.println("Number of rooms is " + numOfRooms);
        System.out.println("Guests number is " + numOfGuests);
    }
}
