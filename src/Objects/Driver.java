package Objects;

public class Driver {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Lexus";
        car1.year = 2019;
        car1.mileage = 5000;
        car1.sportEdition = true;

        System.out.println(car1.mileage);
        car1.drive("Downtown");
        System.out.println(car1.mileage);
        car1.drive(213);
        System.out.println(car1.mileage);
    }
}
