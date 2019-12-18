package StaticExamples;

public class Mouse {

    String color;
    int size;
    boolean condition;
    boolean wireless;

public Mouse (String color, int size, boolean wireless, String name){
    System.out.println(name + " is creating Mouse program");
    this.color = color;
    this.size = size;
    this.wireless = wireless;
}
public Mouse(){ //overloaded no-argument constructor
}
}