package Lesson3_AbstractClassesAndInterfaces.InterfaceDemo.WithInterface;

public class NotificationSender {
    private NotificationService service;  // using interface, not specific class

    public NotificationSender(NotificationService service) {
        this.service = service;
    }

    public void sendNotification(String message) {
        service.send(message);
    }
}

/*
✅ Notice This Improvement:

1️⃣ We are no longer hardcoding EmailService inside NotificationSender.
    -> That means NotificationSender does NOT create the EmailService object by itself.

2️⃣ Instead, we are injecting (giving) the service from outside.
    -> This is known as **Dependency Injection (DI)**.

💡 Why is this good?

✔️ Makes the class more flexible and reusable.
    -> We can easily pass an SMSService, WhatsAppService, or any future service.

✔️ Supports the **Open-Closed Principle (OCP)**.
    -> We can EXTEND behavior (new types of notifications)
       without MODIFYING existing NotificationSender code.

✔️ Helps in Unit Testing.
    -> We can easily inject a fake/mock service to test NotificationSender in isolation.

🛠️ In short:
    - "Don't hardcode dependencies. Inject them."
    - This leads to better design, cleaner code, and future-proof systems.
*/
