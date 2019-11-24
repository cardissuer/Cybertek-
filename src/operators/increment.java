package operators;

public class increment {
    public static void main(String[] args) {
        int age = 5;
        //age+=1
        //age++; post-increment after the statement is done
        //++age; pre-increment before the statement is done
        /*System.out.println(age);
        System.out.println(++age);
        System.out.println(age++);
        System.out.println(age);*/

        int x = 11;
        int y = x++;
        System.out.println(++x);
        System.out.println(y);
        System.out.println(x);
    }
}