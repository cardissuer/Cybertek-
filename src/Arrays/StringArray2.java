package Arrays;

public class StringArray2 {
    public static void main(String[] args) {
        //String[] colors = new String[4];
        //colors[0] = "white";
        //colors[1] = "black";
        //colors[2] = "yellow";
        //colors[3] = "red";

        String [] colors = {"white","black", "yellow", "red"};
        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];
            if (colors.length >= 4) {
                System.out.println("Color" + (i + 1) + " is " + color);
            }
        }
    }
}