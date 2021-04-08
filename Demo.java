public class Demo {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product frisbee = Catalogue.getProduct("Frisbee");
        Product golfClub = Catalogue.getProduct("Golf Club");
        Product lightbulb = Catalogue.getProduct("Lightbulb");

        cart.addProduct(frisbee);
        cart.addProduct(golfClub);
        cart.addProduct(lightbulb);

        System.out.println(cart);
        System.out.println(cart.getTotalCost());
    }
}
