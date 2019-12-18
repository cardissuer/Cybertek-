package Encapsulation;

public class Storage {
    public static void main(String[] args) {
        Chair chair = new Chair();
        chair.model = "James";
        chair.setSize(20);

        chair.info();
        System.out.println(chair.getSize());
    }
}