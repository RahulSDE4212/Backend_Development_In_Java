package Lesson6_DependencyInversionPrinciple.BetterCode;

// PayPalPaymentService.java (Another low-level module)
public class PayPalPaymentService implements IPaymentService {
    public void processPayment(double amount) {
        System.out.println("Processing payment of ₹" + amount + " via PayPal");
    }
}