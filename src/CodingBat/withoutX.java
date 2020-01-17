package CodingBat;

public class withoutX {

    public static void main(String[]args){
        System.out.println(withoutX("x"));
        }

    public static String withoutX (String str) {

            if (str.length()>2) {
                if ((str.startsWith("x")) && (str.endsWith("x"))){
                    return str.substring (1,str.length()-2);
                } if ((str.charAt(0)+"").equals("x")){
                    return str.substring(1);
                } if ((str.charAt (str.length()-1)+"").equals ("x")){
                    return str.substring (0,str.length()-2);
                }
            } if (str.length()==1 && str.equals("x")){ return "";
            } return str;
        }
}

