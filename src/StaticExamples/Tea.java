package StaticExamples;

public class Tea {
    public static void main(String[] args) {
        Mouse m1 = new Mouse();
        Mouse m2 = new Mouse();
        m1.color = "White";
        System.out.println(m1.color);
        //System.out.println(m1);
        //System.out.println(m2);
        Mouse m3 = m2;//pointing a reference to m2 object
        m2=m1;
        //System.out.println();
        //System.out.println(m2);
        //System.out.println(m1);
        m2.color = "Black";
        System.out.println(m1.color);
        System.out.println(m3.color);
        Mouse m4 = new Mouse("Grey",23,true,"Donald");
        System.out.println(m4);
    }
}