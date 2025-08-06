package Lesson6_DependencyInversionPrinciple.ProblematicCode;

// Checkout.java (HIGH-LEVEL MODULE)
public class Checkout {
    private PaymentService paymentService = new PaymentService(); // tightly coupled

    public void completeOrder(double amount) {
        // Directly depends on Razorpay's implementation
        paymentService.processPayment(amount);
    }
}
