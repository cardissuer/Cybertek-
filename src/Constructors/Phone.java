package Constructors;

import com.sun.security.jgss.GSSUtil;

public class Phone {

    boolean touchscreen;
    String model;
    int memory;
    String color;
    long phoneNumber;
    String textMsg;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Phone(String model, String color, int memory, boolean touchscreen) {
        this(model, color);
        this.touchscreen = touchscreen;
        if (memory < 0) {
            System.out.println("Invalid memory");
        } else {
            this.memory = memory;
        }
    }
            public void info() {
                System.out.println("\nPhone number: " + this.phoneNumber);
                System.out.println("Model: " + this.model);
                System.out.println("Memory: " + this.memory);
                System.out.println("Color: " + this.color);
                System.out.println("Touchscreen: " + this.touchscreen);
            }
            //Create a method text that accepts long(phone number) and String(text) and returns boolean.
    // Check given number length and text body.
    //Print: “%textBody sent to %givenPhoneNumber” if length is 10 and text body is not empty then return true;
    // Print: “Invalid phone number or text body” and return false if otherwise.
    //Create a method call that accepts long (phone number). Print “Calling to %phoneNumber” if phone number length is 10.
    // Print “Invalid phone number” if otherwise.

            public boolean text (long phoneNumber, String textMsg) {
            String pString = phoneNumber+"";
            if (pString.length() == 10 && !textMsg.isEmpty()) {
                System.out.println(textMsg + " is sent to " + phoneNumber);
                return true;
            }
            else{
                System.out.println("Invalid phone number or phone message");
                return false;
            }
        }

        public void call (long phoneNumber) {
        String pString = phoneNumber+"";
        if (pString.length() == 10){
            System.out.println("Calling to " + phoneNumber);
        } else {
            System.out.println("Invalid phone number");
        }
        }
}