package Exceptions;

public class Driver {
    private String name;
    private int age;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        this.name = name;
        if (name.contains(" ")){
            throw new Exception(name + " is invalid");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}