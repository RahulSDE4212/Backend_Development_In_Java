package Pattern1.BetterCode.version3;

import java.util.List;

public class Product {
    private String name;
    private String description;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    Product(Builder builder) {
        if(builder.getPrice() > 0) {
            this.price = builder.getPrice();
        }

        this.name = builder.getName();
        this.brand = builder.getBrand();
        // ....
    }
}
