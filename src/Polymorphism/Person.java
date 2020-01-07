package Polymorphism;

public class Person {

    private String name;

    public Person(String name){
        setName(name);
    }

    public void info (){
        System.out.println("Name " + getName());
    }

    public boolean hasSameName(Person otherPerson){
    return this.getName().equalsIgnoreCase(otherPerson.getName());
    }

    public void setName (String name){
    this.name = name;
    }

    public String getName (){
        return name;
    }

    protected int getStudentNumber() {
       return getStudentNumber();
    }
}