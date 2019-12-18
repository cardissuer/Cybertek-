package Encapsulation;

public class Chair {
    public int size;
    public String model;

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        }
    }

    public int getSize (){
        if (this.model.equals("IKEA")){
            return size;
        }
        System.out.println("This is not the IKEA");
        return 0;
    }

    public void info(){
        System.out.println("Model: " + this.model);
        System.out.println("Size: " + this.size);
    }
}
