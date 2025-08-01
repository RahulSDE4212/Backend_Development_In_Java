package Lesson2_OpenClosePrinciple.TakeHomeTask.Task1.ProblematicCode;

enum ProductType {
    ELECTRONICS,
     CLOTHING;
}

class Product {
    ProductType type;
    double price;
    double getPrice() {
         return price;
     }

    ProductType getType() {
        return type;
    }
}

public class DiscountCalculator {
    public double calculateDiscount(Product product) {
        if (product.getType() == ProductType.ELECTRONICS) {
            return product.getPrice() * 0.10; // 10% discount
        } else if (product.getType() == ProductType.CLOTHING) {
            return product.getPrice() * 0.20; // 20% discount
        }
        return 0;
    }
}