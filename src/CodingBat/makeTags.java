package CodingBat;

public class makeTags {
    public static void main(String[] args) {
        System.out.println(makeTags("em","Chicago"));
    }

    public static String makeTags (String tag, String word){
        return ("<" + tag + ">" + word +  "</" + tag + ">");
        }
    }
