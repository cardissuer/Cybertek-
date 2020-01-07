package CustomExceptions;

import java.util.Random;

public class Laptop {

    public String getOs() {
        return os;
    }

    public void setOs(String os) throws InvalidOsException {

        switch (os.toLowerCase()){
            case "Windows":
            case "Mac":
            case "Linux":
                this.os = os;
                break;
            default:
                throw new InvalidOsException();
        }
    }

    private String os;
    public boolean turnOn(){
        Random random = new Random();
        int num = random.nextInt(11);
        System.out.println(num);
        if (num<=8){
        throw new LaptopNotTurningOnException();
        }
        return true;
    }
}