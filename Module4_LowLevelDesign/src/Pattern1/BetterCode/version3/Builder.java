package Pattern1.BetterCode.version3;

import java.util.List;

public class Builder {
    private String name;
    private String description;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    Builder() {

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() { return this.name; }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() { return this.description; }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() { return this.price; }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() { return this.brand; }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() { return this.category; }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public int getDiscount() { return this.discount; }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getCreatedAt() { return this.createdAt; }

    public void setUpdatedAt(String updatedAt) {this.updatedAt = updatedAt; }
    public String getUpdatedAt() { return this.updatedAt; }

    public void setImages(List<String> images) {
        this.images = images;
    }
    public List<String> getImages() { return this.images; }
}
