package Abstraction2;

public class Chrome extends Browser {

    @Override
    public void launch() {
        System.out.println("Chrome is launching ");
    }

    @Override
    public void browse(String url) {
        System.out.println("Chrome is browsing url " + url);
    }

    @Override
    public int numberOfTabs() {
        System.out.println("Chrome is returning a number of Tabs opened ");
        return 10;
    }

    @Override
    public void close() {
        //super.close();
    }
}