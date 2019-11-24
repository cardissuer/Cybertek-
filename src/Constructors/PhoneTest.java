package Constructors;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone ("Xiaomi", "Blue");
        phone.info();
        phone.memory=45;
        phone.info();
        Phone samsung = new Phone ("Samsung", "Black", -45, true);
        samsung.info();
        System.out.println("-------------------------------");
        samsung.text(1772799360,"What's up");
        phone.text(199988765, "Where is it");
        System.out.println("////////////////////////////////////");
        samsung.call(1234560090);
    }
}