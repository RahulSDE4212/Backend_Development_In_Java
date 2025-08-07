package Pattern1.BetterCode.version4;

public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                            .setName("Iphone")
                            .setPrice(1000)
                            .setBrand("Apple")
                            .setDescription("New apple iphone")
                            .setCategory("Mobile")
                            .build();
    }
}