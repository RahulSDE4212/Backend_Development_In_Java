package Pattern1.ProblematicCode;
import java.util.*;
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

    Product(String name, String description, int price, String brand, String category, int discount, String createdAt, String updatedAt, List<String> images) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.brand = brand;
        this.category = category;
        this.discount = discount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.images = images;
    }

    Product(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
