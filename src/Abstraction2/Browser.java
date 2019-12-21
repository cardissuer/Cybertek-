package Abstraction2;

import org.w3c.dom.ls.LSOutput;

public abstract class Browser {
    String name;
    double version;
    double size;

    public abstract void launch();
    public abstract void browse (String url);
    public abstract int numberOfTabs();
    public void close (){
        System.out.println("Browser is closing ");
    }

}