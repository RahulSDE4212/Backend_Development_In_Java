package Lesson3_AbstractClassesAndInterfaces.InterfaceDemo.IfNOInterface;

public class NotificationSender {
    private EmailService emailService;

    public NotificationSender() {
        emailService = new EmailService(); // hardcoded dependency
    }

    public void sendNotification(String message) {
        emailService.sendEmail(message);
    }
}

/*
🔴 What’s Wrong in This Approach?

1️⃣ NotificationSender is tightly coupled with EmailService.
    -> It means NotificationSender directly creates and depends on EmailService.
    -> If you want to switch to SMS, WhatsApp, or any other service,
       you have to change the code of NotificationSender.

2️⃣ This design is rigid and not scalable.
    -> Adding a new type of notification requires modifying existing classes.
    -> This violates the SOLID principle: Open-Closed Principle (OCP).

🔓 Open-Closed Principle (OCP) says:
    -> "Software entities (classes, modules, functions) should be
        open for extension but closed for modification."

    ❌ In this code, every time we want to support a new notification type
        (e.g., SMS, WhatsApp, Push), we have to MODIFY NotificationSender.

    ✅ Ideally, we should be able to EXTEND the functionality
        (by creating new classes) without touching NotificationSender at all.

💣 Bottom Line:
    - Hardcoding dependencies makes the code less flexible, hard to test, and harder to maintain.
    - It creates a ripple effect — changing one class forces changes in many places.
    - Interfaces solve this by providing a common contract that can be implemented differently.

✅ Solution: Use Interface + Polymorphism to decouple NotificationSender from specific services.
*/
