package Lesson6_DependencyInversionPrinciple.ProblematicCode;

// PaymentService.java (LOW-LEVEL MODULE)
public class PaymentService {
    public void processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount + " via Razorpay");
    }
}
