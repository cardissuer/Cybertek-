package Objects;

public class House {
    String type;
    String address;
    int numRooms;

    public void info(){
        System.out.println("House type: " + this.type);
        System.out.println("House address: " + this.address);
        System.out.println("Number of rooms in this house: " + this.numRooms);
    }
}
