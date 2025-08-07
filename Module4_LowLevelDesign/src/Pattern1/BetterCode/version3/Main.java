package Pattern1.BetterCode.version3;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setBrand("Apple");
        builder.setName("Iphone");
        builder.setPrice(100000);

        Product product = new Product(builder);
    }
}
