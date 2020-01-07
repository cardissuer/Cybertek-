package Exceptions;

public class Dog {
    int age;
    public void setAge (int age) throws Exception {
        if (age<0 || age >30){
            throw new RuntimeException(age + " is an invalid age");
        }
        this.age = age;
    }
}
