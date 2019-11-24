package stringmanipulation;

public class example10 {
    public static void main(String[] args) {
        String sentence = "<Alex Khodyrev>. From number [5182565244] + Message {I love programming and problem solving}";
        int senderStart = sentence.indexOf("<")+1;
        int senderEnd = sentence.indexOf(">");
        int numberStart = sentence.indexOf("[")+1;
        int numberEnd = sentence.indexOf("]");
        int messageStart = sentence.indexOf("{")+1;
        int messageEnd = sentence.indexOf("}");

        String sender = sentence.substring(senderStart,senderEnd);
        String number = sentence.substring(numberStart,numberEnd);
        String message = sentence.substring(messageStart,messageEnd);

        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Message: " + message);
        }
    }
