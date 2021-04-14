import java.util.*;

public class ShoppingCart {

    private List<LineItem> lineItems = new ArrayList<>();

    public void addLineItem(LineItem lineItem) {
        lineItems.add(lineItem);
    }

    public int getTotalCost() {
        return lineItems.stream().mapToInt(LineItem::getPrice).sum();
    }

    public void listItems() {
        lineItems.forEach((lineItem) -> System.out.println(lineItem.getProduct().getName()));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The Cart Contains:\n");
        lineItems.forEach(
                (lineItem) -> sb.append(lineItem.getProduct().getName() + " x " + lineItem.getQuantity() + "\n"));
        return sb.toString();
    }

}