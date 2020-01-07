package Polymorphism;

public class Student extends Person {

    private int studentNumber;

    public Student(String name, int number){
        super(name);
        getStudentNumber(number);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Student number = " + getStudentNumber());
    }

    public boolean equals (Student otherStudent){
        return this.hasSameName(otherStudent) && this.getStudentNumber() ==
                otherStudent.getStudentNumber();
    }

    public void setStudentNumber (){
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber (int studentNumber){
        return studentNumber;
    }

    public Student(){
        super("");
    }

}