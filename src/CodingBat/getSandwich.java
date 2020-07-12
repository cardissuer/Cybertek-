package CodingBat;

public class getSandwich{
    public static void main(String[] args) {
        System.out.println(getSandwich("trybreadnotevenbreadforyou"));
    }

public static String getSandwich(String str) {
    int iFirst = str.indexOf("bread");
    int iLast = str.lastIndexOf("bread");
    if (iFirst!=-1&&iLast!=-1&&iFirst!=iLast){
        return str.substring(iFirst+5, iLast);
        }
    return "";
    }
}
