package Arrays;

public class ForEachLoopGurhan {
    public static void main(String[] args) {
        String[] carBrands = {"mersedes: ", "bmw: ", "toyota: ", "ferrari: "};
        for (String car : carBrands) {
            System.out.print(car);
            if (car.equalsIgnoreCase("mersedes: ")){
                System.out.println("Luxury-Comfort");
            } if (car.equalsIgnoreCase("bmw: ")){
                System.out.println("Luxury-Sport");
            } if (car.equalsIgnoreCase("toyota: ")){
                System.out.println("Reliable-Cheap");
            } if (car.equalsIgnoreCase("ferrari: ")){
                System.out.println("Super expensive");
            }
                //System.out.println(car);
            }
        }
    }
