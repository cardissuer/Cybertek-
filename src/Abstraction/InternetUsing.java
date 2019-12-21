package Abstraction;

public class InternetUsing {
    public static void main(String[] args) {

        Chrome chrome = new Chrome();
        chrome.version = 65.7;
        chrome.launch();
        chrome.browse("stackoverflow.com");
        chrome.addTab("okta.cybertekschool.com");
        Firefox firefox = new Firefox();
        firefox.launch();
        firefox.browse("stackoverflow.com");
    }
}
