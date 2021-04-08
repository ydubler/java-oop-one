public class Product {

    private final String name;
    private final ProductType type;
    private int price;

    public Product(String name, ProductType type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return this.name;
    }

}