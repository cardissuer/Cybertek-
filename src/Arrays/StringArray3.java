package Arrays;

public class StringArray3 {
    public static void main(String[] args) {
        //Create String array for students. Initialize with students below: James, John, Adam, Elize, Jamie, Benzema
        //Loop through each elements of students. - print first character of each name on each line.
        String [] names = {"James", "Sam", "Adam", "Elize", "Jamie", "Benzema", "Sandy"};
        for (int i=0; i < names.length; i++ ) {
            int last = names[i].length()-1;
            System.out.println("Last letter of " + i + " name is " + names[i].charAt(last));
        }
    }
}
