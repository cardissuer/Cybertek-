package Polymorphism;

public class HighSchoolStudent extends Student {
    private int gradeLevel;

    public HighSchoolStudent (String name, int number){
        super(name, number);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Grade Level " + getGradeLevel());
    }

    public void setGradeLevel (int gradeLevel){
        if (gradeLevel>=9 && gradeLevel<=12){
            this.gradeLevel = gradeLevel;
        }else {
            System.out.println("Invalid grade level");
            System.exit(0);
        }
    }

    public int getGradeLevel(){
        return gradeLevel;
    }

    public static void main(String[] args) {
        HighSchoolStudent Student = new HighSchoolStudent("james", 20);
        HighSchoolStudent Student1 = new HighSchoolStudent("john", 30);
        HighSchoolStudent Student2 = new HighSchoolStudent("jarvis", 40);
    }

    Person[]people = new Person[3];

    //public boolean equals (HighSchoolStudent otherStudent){
      //  super.equals(otherStudent) && this.getGradeLevel() == otherStudent.getGradeLevel();
    //}
}