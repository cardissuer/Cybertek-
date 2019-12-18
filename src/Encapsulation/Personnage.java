package Encapsulation;

public class Personnage {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jemma");
        person.setAge(50);
        /*do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            if (age > 0 && age < 120) {
                person.setAge(age);
                break;
            }
        }while (age < 0 && age > 120);*/
            person.setHeight(6);
            person.setWeight(170);
            person.setGender('F');
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Height: " + person.getHeight());
            System.out.println("Weight: " + person.getWeight());
            System.out.println("Gender: " + person.getGender());
        }
    }