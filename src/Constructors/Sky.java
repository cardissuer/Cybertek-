package Constructors;

public class Sky {
    public Sky(String colorCode) {
        this.color=colorCode;
    }
    public Sky (String color, int visibleStars){
        this.color = color;
        this.visibleStars = visibleStars;
    }

    String color;
    int visibleStars;

    public void info () {
        System.out.println("Color: " + color);
        System.out.println("Stars in the sky: " + visibleStars);
    }

    public static void main(String[] args) {
    Sky refSky = new Sky("Blue");
        //System.out.println(refSky.color);
        refSky = new Sky("Red", 7);

        Sky s2 = new Sky("Yellow", 20);
        s2.info();
        refSky.info();
    }
}