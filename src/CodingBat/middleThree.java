package CodingBat;

public class middleThree {
    public String middleThree(String str) {
        if (str.length() >= 3) {
            return str.substring((str.length() / 2 - 1), (str.length() / 2 + 1));
        }
        return str;
    }
}
