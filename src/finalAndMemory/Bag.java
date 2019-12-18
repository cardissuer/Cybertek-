package finalAndMemory;

public class Bag {

    final String color;
    final static int totalBags;
    final int size;

    //final instance variable MUST BE INITIALIZED, once initalized it's value CAN'T BE CHANGED
    //Option 1: Initialize it right away, give a value when declaring an instance variable
    //Option 2: Initialize it within the constructor. Instance variables cannot be used without creating an object.
    // If we use constructor to initialize FINAL INSTANCE VARIABLE, it allows to do that
    //Option 3: Instance initializer block. It is used for writing any code which we can't use in instance variables.
    //It looks like a static block but without static signature anyways.

    {
        size = 4;
    }

    static{
        totalBags=45;
    }

    public Bag () {
        this.color = "Red";
    }

    public Bag (String color){
        this.color = color;
    }
}
