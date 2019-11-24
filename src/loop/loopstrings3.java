package loop;

public class loopstrings3 {
    public static void main(String[] args) {
        for (int i=0;i<50;i+=1) {
            if (i%10==3) {
                continue;
            } else
                System.out.println(i);
        }
    }
}

//second way to do it
/*for (int i=0;i<50;i+=1) {
    String temp = i + "";
    if (temp.endsWith("3")){
        continue;
        }
    System.out.println (i);*/