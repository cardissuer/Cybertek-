package Abstraction2;

public class Safari extends Browser {

    @Override
    public void launch() {
        System.out.println("Safari is launching ");
    }

    @Override
    public void close() {
        System.out.println("Safari is closing ");;
    }

    @Override
    public int numberOfTabs() {
        return 10;
    }

    @Override
    public void browse(String url) {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}