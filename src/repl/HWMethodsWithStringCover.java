package repl;

public class HWMethodsWithStringCover {

    public static void main(String[] args) {
        System.out.println(coverString("java methods", "mf") ) ; //java [methods]
    }

    public static String coverString(String main, String coverME) {

        //coverString method will take 2 string parameters from the caller.
        //
        //Your job is to write an important code that will :
        //
        //- to search and find each appearance of coverME within main
        //- then surround it with [coverMe] (square brackets)
        //- if you cannot find the coverME within main after tirelessly looping then just return whole main
        // itself covered [main].
        //- keep in mind that coverME value can be of any length.
        if (main.contains(coverME)){
            for (int i=0;i<main.length();i++){
                if (main.charAt(i) == coverME.charAt(0)){
                    return (main.substring(0,i) + "[" + coverME + "]" + main.substring(i+coverME.length()));
                }
            }
        }
        return ("[" + main + "]");
}
}
