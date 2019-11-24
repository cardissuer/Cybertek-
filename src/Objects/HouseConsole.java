package Objects;

import java.util.Scanner;

public class HouseConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House myHouse = new House();
        System.out.println("Please enter all parameters of house");
        System.out.println("Please enter house type");
        myHouse.type = scanner.nextLine();
        System.out.println("Please enter the address");
        myHouse.address=scanner.nextLine();
        System.out.println("Please enter number of rooms");
        myHouse.numRooms = scanner.nextInt();
        myHouse.info();
    }
}
