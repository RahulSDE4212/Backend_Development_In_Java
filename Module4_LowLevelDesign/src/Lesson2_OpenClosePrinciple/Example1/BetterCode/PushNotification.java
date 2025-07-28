package Lesson2_OpenClosePrinciple.Example1.BetterCode;

public class PushNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending Push notification...");
    }
}