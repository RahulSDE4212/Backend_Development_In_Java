package Lesson6_DependencyInversionPrinciple.BetterCode;

// Main.java
public class Main {
    public static void main(String[] args) {
        IPaymentService paymentService = new RazorpayPaymentService();  // can switch easily
        Checkout checkout = new Checkout(paymentService);
        checkout.completeOrder(999.99);

        System.out.println("\nSwitching to PayPal...\n");

        IPaymentService payPal = new PayPalPaymentService();
        Checkout checkoutWithPayPal = new Checkout(payPal);
        checkoutWithPayPal.completeOrder(1599.49);
    }
}