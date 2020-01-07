package Exceptions;

public class ThrowExc {

    public static void main(String[] args) throws Exception {
        Thread.sleep(1000);
        Dog dog = new Dog();
        //dog.setAge(40);
        System.out.println(dog.age);
        Driver driver = new Driver();
        driver.setName("Chris Pine is awesome actor");
        System.out.println(driver.getName());
        }
    }