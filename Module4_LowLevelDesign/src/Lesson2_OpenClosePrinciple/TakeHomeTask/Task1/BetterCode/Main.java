package Lesson2_OpenClosePrinciple.TakeHomeTask.Task1.BetterCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create available discount strategies and map them to product types
        Map<String, DiscountStrategy> discountStrategies = new HashMap<>();
        discountStrategies.put("electronics", new ElectronicsDiscountStrategy());
        discountStrategies.put("clothing", new ClothingDiscountStrategy());
        discountStrategies.put("book", new BookDiscountStrategy());

        // Step 2: Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product type (electronics/clothing/book): ");
        String productType = scanner.nextLine().trim().toLowerCase();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.close();

        // Step 3: Create product
        Product product = new Product(price);

        // Step 4: Look up the appropriate strategy
        DiscountStrategy strategy = discountStrategies.get(productType);

        if (strategy == null) {
            System.out.println("No discount strategy available for product type: " + productType);
            return;
        }

        // Step 5: Calculate discount
        DiscountService discountService = new DiscountService();
        double discount = discountService.calculateDiscount(product, strategy);

        // Step 6: Output result
        System.out.println("Discount on " + productType + ": ₹" + discount);
        System.out.println("Final Price: ₹" + (price - discount));
    }
}
