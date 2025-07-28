package Lesson2_OpenClosePrinciple.Example1.BetterCode;

public class WhatsappNotification implements Notification{

    @Override
    public void send() {
        System.out.println("Sending Whatsapp...");
    }
}