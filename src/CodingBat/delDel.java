package CodingBat;

public class delDel {
    public String delDel(String str) {
        if (str.length()>3){
            if (str.substring(1,4).equalsIgnoreCase("del")){
                return str.replace("del", "");
            }
        }
        return str;
    }
}
