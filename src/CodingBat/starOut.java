package CodingBat;

public class starOut {
    public static void main(String[] args) {
        System.out.println(starOut("apr***illi**nois"));
    }

/*    public static String starOut(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
        }
    }
}*/

//    public static String starOut(String str) {
//        if (str.contains("*")) {
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == '*') {
//                    str.replace(str.substring(str.charAt(i - 1), str.charAt(i + 1)), "");
//                }
//            }
//        } return str;
//    }
//}

    public static String starOut(String str)
    {
        int len = str.length();
        int[] indexes = new int[len];
        char ch;
        StringBuilder stbuild = new StringBuilder(len);
        for(int i = 0; i < len; i++)
        {
            if(str.charAt(i) == '*')
            {
                indexes[i] = 1;
                if(i >= 1)
                    indexes[i-1] = 1;
                if(i < (len-1))
                    indexes[i+1] = 1;
            }
        }
        for(int i = 0; i < len; i++)
        {
            if(indexes[i] == 0)
                stbuild.append(str.charAt(i));
        }
        return stbuild.toString();
    }
}