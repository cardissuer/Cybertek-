package CodingBat;

public class without2 {

    public static void main(String[] args) {
        System.out.println(withoutX("xErox"));
    }
    public static String withoutX(String str) {
if (str.length()>2){
    if ((str.charAt(0)+"").equalsIgnoreCase("x")){
        return str.substring(1);
    } if((str.charAt(str.length()-1)+"").equalsIgnoreCase("x")){
        return str.substring(0,str.length()-1);
    } if ((str.charAt(0)+"").equalsIgnoreCase("x") && (str.charAt(str.length()-1)+"").equalsIgnoreCase("x")){
        return str.substring(1,str.length()-1);
    }
} return str;
    }
}
