package Lesson3_AbstractClassesAndInterfaces.InterfaceDemo.WithInterface;

public class EmailService implements NotificationService {
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}