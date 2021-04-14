public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getPrice() {
        int cost = product.getPrice() * quantity;
        return cost;
    }

    @Override
    public String toString() {
        return "Line Item:\n\tProduct Name: " + product.getName() + "\nQuantity: " + quantity + "\nTotal Cost: "
                + getPrice();
    }

}
