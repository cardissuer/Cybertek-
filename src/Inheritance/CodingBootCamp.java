package Inheritance;

public class CodingBootCamp extends School {
    public static void main(String[] args) {
        CodingBootCamp codingbootcamp = new CodingBootCamp();
        codingbootcamp.name = "Chandler";
        codingbootcamp.address = "3230 N Ridgeaway";
        codingbootcamp.type = "Private";
        codingbootcamp.giveHW();
        codingbootcamp.hostEvent("12/13/2019");

        //Create a class School. 
        //instance variables: name, address, type 
        //create a method giveHW.
        // Method doesn’t take anything or return anything.
        // Simply print “%schoolName is giving home work”. 
        //Create method hostEvent. Void method and accepts date.
        // This method should print “Hosting an event on %date”. 
        //2. Create class CodingBootcamp Extend to School.
        //* Create object from CodingBootcamp class and see what properties and method are offered.
    }
}