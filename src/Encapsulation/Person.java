package Encapsulation;

public class Person {
    private String name;
    private char gender;
    private int age;
    private int height;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public char getGender() {
        if (gender == 'M' || gender == 'F') {
            return gender;
        }
        System.out.println("Invalid input");
        return 0;
    }
    public int getAge() {
        if (age > 0 && age < 120) {
            return age;
        }
        System.out.println("Invalid age");
        return 0;
    }
    public int getHeight() {
        if (height > 0) {
            return height;
        }
        System.out.println("Invalid height");
        return 0;
    }
    public int getWeight() {
        if (weight > 0) {
            return weight;
        }
        System.out.println("Invalid weight");
        return 0;
    }
}