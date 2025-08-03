package Lesson3_AbstractClassesAndInterfaces.InterfaceDemo.WithInterface;

public class SMSService implements NotificationService {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}