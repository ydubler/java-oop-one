public class Demo {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product frisbee = Catalogue.getProduct("Frisbee");
        Product golfClub = Catalogue.getProduct("Golf Club");
        Product lightbulb = Catalogue.getProduct("Lightbulb");
        Product msword = Catalogue.getProduct("Microsoft Word");

        LineItem liFrisbee = new LineItem(frisbee, 3);
        LineItem liGolfClub = new LineItem(golfClub, 1);
        LineItem liLightbulb = new LineItem(lightbulb, 4);
        LineItem liMsWord = new LineItem(msword, 1);

        cart.addLineItem(liFrisbee);
        cart.addLineItem(liGolfClub);
        cart.addLineItem(liLightbulb);
        cart.addLineItem(liMsWord);

        System.out.println(cart);
        System.out.println(cart.getTotalCost());
    }
}
