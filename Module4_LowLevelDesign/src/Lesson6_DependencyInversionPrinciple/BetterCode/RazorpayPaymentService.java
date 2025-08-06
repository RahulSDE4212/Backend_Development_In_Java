package Lesson6_DependencyInversionPrinciple.BetterCode;

// RazorpayPaymentService.java (Low-level module)
public class RazorpayPaymentService implements IPaymentService {
    public void processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount + " via Razorpay");
    }
}