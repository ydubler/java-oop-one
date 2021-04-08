import java.util.*;

public class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getTotalCost() {
        return products.stream().mapToInt(Product::getPrice).sum();
    }

    public void listItems() {
        products.forEach((n) -> System.out.println(n.getName()));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The Cart Contains:\n");
        products.forEach((product) -> sb.append(product.getName() + "\n"));

        return sb.toString();
    }

}