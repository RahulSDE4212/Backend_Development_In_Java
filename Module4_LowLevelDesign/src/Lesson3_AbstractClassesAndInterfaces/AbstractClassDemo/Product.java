package Lesson3_AbstractClassesAndInterfaces.AbstractClassDemo;

public abstract class Product {
    public abstract double calculateDiscount();

    public void termsAndConditions() {
        System.out.println("Some terms");
    }
}
