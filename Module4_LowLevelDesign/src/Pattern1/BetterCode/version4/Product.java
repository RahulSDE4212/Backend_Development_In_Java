package Pattern1.BetterCode.version4;


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

    private Product(Builder builder) {
        if(builder.getPrice() > 0) {
            this.price = builder.getPrice();
        }

        this.name = builder.getName();
        this.brand = builder.getBrand();
        this.description = builder.getDescription();
        this.category = builder.getCategory();
        this.createdAt = builder.getCreatedAt();
        if(builder.getDiscount() > 0) {
            this.discount = builder.getDiscount();
        }

        this.updatedAt = builder.getUpdatedAt();
        this.images = builder.getImages();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    static class Builder {
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

        public String getName() { return this.name; }
        public String getDescription() { return this.description; }
        public int getPrice() { return this.price; }
        public String getBrand() { return this.brand; }
        public String getCategory() { return this.category; }
        public int getDiscount() { return this.discount; }
        public String getCreatedAt() { return this.createdAt; }
        public String getUpdatedAt() { return this.updatedAt; }
        public List<String> getImages() { return this.images; }




        public Product build() {
            return new Product(this);
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setImages(List<String> images) {
            this.images = images;
            return this;
        }
    }
}
