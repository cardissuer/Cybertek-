package Rebootcamp;

public class Java {

    public static void main(String[] args) {
        System.out.println(Javva("javaghjkjavafhgkjgjavajfghlshg"));
        System.out.println(Javvva("Java has so much fun java flexible and java has fun"));
        System.out.println(Jara("Java has so much fun java flexible and java has fun"));
    }
    public static int Javva (String word){
        int count = 0;
    for (int i=0; i<word.length()-3;i++){
        if (word.charAt(i)=='j'&&word.charAt(i+1)=='a'&&word.charAt(i+2)=='v'&&word.charAt(i+3)=='a') count ++;
    } return count;
    }
    public static int Javvva (String word){
        int count = 0;
        for (int i=0; i<word.length()-3;i++){
            if (word.substring(i,i+4).equalsIgnoreCase("java")) count++;
        }
        return count;
    }

    public static int Jara (String word){
        int count =0;
        while (word.toLowerCase().contains("java")){
            count++;
            word = word.toLowerCase().replaceFirst("java", "");
        }
        return count;
    }

}
