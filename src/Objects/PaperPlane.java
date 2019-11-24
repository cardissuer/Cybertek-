package Objects;

public class PaperPlane {
    public static void main(String[] args) {
        //create 2 Flag objects
        //set all values to first one only
        //and copy first instance variables to second one
        //and reset the first object values to zeros for numbers and "a" for Strings}

        Flag flag1 = new Flag();
        Flag flag2 = new Flag();
        flag1.country = "Argentina";
        flag1.color = "Sky Blue";
        flag1.size = 10;
        flag1.material = "Plastic";

        flag2.country = flag1.country;
        flag2.color = flag1.color;
        flag2.size = flag1.size;
        flag2.material = flag1.material;

        flag1.country = "a";
        flag1.color = "a";
        flag1.size = 0;
        flag1.material = "a";

        flag1.info();
        flag2.info();
        flag1.upgrade(255,"gold");
    }
}