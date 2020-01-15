package CodingBat;

public class lastChars {
    public static void main(String[] args) {
        System.out.println(lastChars("dog","cat"));
    }
    public static String lastChars(String a, String b) {
        String result = "";
        //String a1 = a.charAt(0)+"";
        //String b1 = b.charAt(b.length()-1) + "";
        if (a.length()>0 && b.length()>0){
            result = "" + a.charAt(0)+b.charAt(b.length()-1);
        } if (a.length() == 0 && b.length()>0){
            result = "@" + b.charAt(b.length()-1);
        } if (a.length()>0 && b.length()==0){
            result = a.charAt(0) + "@";
        } if (a.length()==0 && b.length()==0){
            result = "@@";
        }
        return result;
    }

}
