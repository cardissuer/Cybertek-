package StringBuilder;

public class sbmethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(", Car");
        //sb.delete(1,2);
        //sb.reverse();
        sb.insert(0, "Hello");
        System.out.println(sb);
    }
}
