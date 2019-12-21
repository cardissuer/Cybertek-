package Abstraction;

public class Browser {
    String name;
    double version;
    double size;

    public void launch(){
        System.out.println("Browser is launching ");
    }

    public void browse (String url){
        System.out.println("Browser is browsing " + url);
    }

    public void addTab (String url){
        System.out.println("Browser is adding a tab for url " + url);
    }
}
