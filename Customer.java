public class Customer {
    private final String name;
    private CreditCard creditCard;

    public Customer(String name, long ccNumber) {
        this.name = name;
        this.creditCard = new CreditCard(ccNumber);
    }

    // This method varies so subclasses are used to handle this variance
    public int calculateDiscount() {
        return 0;
    }

    public Order checkout(ShoppingCart cart) {
        Payment payment = creditCard.mkPayment(cart.getTotalCost());

        if (payment == null) {
            System.out.println("Null payment");
        } else {
            System.out.println("GOOD payment");
        }
        return new Order();
    }
}
