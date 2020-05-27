package Rebootcamp.Polymorhism;

public class Polytest {

    public static void main(String[] args) {
        A a = new C();
        B b = new C();
        C c = new C();

        c.m();
        b.m();
        a.m();
        System.out.println();
        System.out.println(c.s);
        System.out.println(b.s);
    }
}
