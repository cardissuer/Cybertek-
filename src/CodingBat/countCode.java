package CodingBat;

public class countCode {

    public int countCode(String str) {
        int count = 0;
        for (int i=0; i<str.length()-4; i++)
            if (str.substring(i,i+2).equalsIgnoreCase("co")&&str.substring(i+3,i+4).equalsIgnoreCase("e")){
                count++;
                continue;
            }
        return count;
    }
}
