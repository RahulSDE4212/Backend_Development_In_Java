package Lesson6_DependencyInversionPrinciple.BetterCode;

// Checkout.java (High-level module - depends on abstraction)
public class Checkout {
    private IPaymentService paymentService;

    // Constructor Injection
    public Checkout(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void completeOrder(double amount) {
        paymentService.processPayment(amount);  // No idea which payment service is used
    }
}
