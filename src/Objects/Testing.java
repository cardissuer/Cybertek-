package Objects;

public class Testing {
    public static void main(String[] args) {

        Flag f1 = new Flag();

        f1.country="USA";
        f1.color = "Red/white";
        f1.size = 5;
        f1.material = "wood";

        //System.out.println(f1.country);

        Flag f2 = new Flag();
        //System.out.println(f2.country);

        f1.info();
    }
}