package Abstraction;

public class Chrome extends Browser {

    @Override
    public void launch() {
        System.out.println("Chrome is launching ");
        // super.launch();
    }

    @Override
    public void browse(String url) {
        System.out.println("Chrome is browsing " + url);
        //super.browse(url);
    }

    @Override
    public void addTab(String url) {
        System.out.println("Chrome is adding tab " + url);
        //super.addTab(url);
    }
}