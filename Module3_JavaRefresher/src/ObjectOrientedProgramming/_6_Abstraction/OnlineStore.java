package ObjectOrientedProgramming._6_Abstraction;

public class OnlineStore {
    public static void main(String[] args) {
        Electronics electronics = new Electronics("dell i3 laptop", 31000);
        System.out.println("The shipping costs are : " + electronics.calculateShippingCosts());
        System.out.println("The Discount are : " + electronics.calculateDiscount());
        System.out.println("The tax on the product are : " + electronics.calculateTax());

        Clothing clothes = new Clothing("dnmx t-shiret", 650.70);
        System.out.println("The shipping costs are : " + clothes.calculateTax());
        System.out.println("The Discount are : " + clothes.calculateDiscount());
        System.out.println("The tax on the product are : " + clothes.calculateDiscount());
    }
}
