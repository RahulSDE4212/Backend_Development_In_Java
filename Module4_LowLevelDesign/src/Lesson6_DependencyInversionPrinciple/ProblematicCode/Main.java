package Lesson6_DependencyInversionPrinciple.ProblematicCode;

// Main.java
public class Main {
    public static void main(String[] args) {
        Checkout checkout = new Checkout();
        checkout.completeOrder(999.99);
    }
}

/*
What’s wrong here?
Checkout class depends on the concrete class PaymentService.

If we want to use PayPal, Stripe, or UPI, we must modify the Checkout class.

This breaks the Dependency Inversion Principle:

High-level modules should not depend on low-level modules.
Both should depend on abstractions (interfaces).
*/