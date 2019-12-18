package Encapsulation;

import static Encapsulation.App.numberOfApps;

public class AppStore {
    public static void main(String[] args) {
        App whatsApp = new App ("WhatsApp","Great",15);
        //whatsApp.info();
        //whatsApp.open();
        //whatsApp.close();
        //whatsApp.update();
        whatsApp.setListOfReviews("Coolest app");
        whatsApp.setListOfReviews("That one");
        System.out.println(whatsApp.getListOfReviews());
        System.out.println(numberOfApps);;
    }
}