package Constructors;

public class Coffee {
    int size;
    String type;
    boolean withMilk;
    boolean withSugar;
    char C;

    public Coffee() {
    }

    public Coffee(String type) {
        this.type = type;
    }

    public Coffee(String type, boolean milk, boolean sugar) {
        this(type);
        this.withMilk = milk;
        this.withSugar = sugar;
    }
}