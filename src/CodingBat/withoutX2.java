package CodingBat;

public class withoutX2 {

    public static void main(String[] args) {
        System.out.println(withoutX2("Hx"));
    }

    public static String withoutX2(String str) {
        if (str.length()>1) {
            if ((str.charAt(0)+"").equals("x") && (str.charAt (1)+"").equals ("x")){
                return str.substring (2);
            } if ((str.charAt(0)+"").equals("x")){
                return str.substring(1);
            } if ((str.charAt (1)+"").equals ("x")){
                return ""+str.charAt(0) + str.substring (2);
            }
        } if (str.length()==1 && str.equals("x")){ return "";
        } return str;
    }
}