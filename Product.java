public class Product {

    private final String name;
    private final ProductType type;
    private int price; // a dollar value, ie 10$
    private int discount; // a percentage discount, 0-100
    private int weight; // the weight of the product

    public Product(String name, ProductType type, int price, int weight) {
        this.name = name;
        this.type = type; // DIGITAL or PHYSICAL
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        int shippingCost = type.getShippingCost(this.weight);
        int price = (int) ((this.price * (100 - this.discount) / 100.0) + shippingCost);
        return price;
    }

    public int getDiscount() {
        return this.discount;
    }
}