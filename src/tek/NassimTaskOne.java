package tek;

class NassimTaskOne {
    static int employeeID = 12345;

//    class Printer {
//    static int s = 10;

//        public static void main(String[] args) {
//            System.out.println(employeeID + 1);
//            System.out.println(s--);
//            System.out.println(--s);
        }

//    public class A {
//        A a = new A();
//    }

    class A
    {
    void  method (int i)
    {
        // method (int)
    }
    }

    class B extends A {
//    @Override
    void method (Integer i)
    {
        System.out.println(i);
    }

        public static void main(String[] args) {
            new B().method(5);
        }
    }
