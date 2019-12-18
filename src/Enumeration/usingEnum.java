package Enumeration;

public class usingEnum {
    public static void main(String[] args) {
        base.LetterGrade grade;
        grade = base.LetterGrade.F;
        getGrade (grade);
    }

    public static void getGrade (base.LetterGrade grade) {
        switch (grade) {
            case A:
                System.out.println("You got an A");
                break;
            case B:
                System.out.println("You got an B");
                break;
            case C:
                System.out.println("You got an C");
                break;
            case D:
                System.out.println("You got an D");
                break;
            case F:
                System.out.println("You got an F");
                break;
        }
    }
}