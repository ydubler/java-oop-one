public class CreditCard {
    private final long cardNumber;

    public CreditCard(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Payment mkPayment(int amount) {
        if (Math.random() > 0.3) {
            return new Payment();
        } else {
            return null;
        }
    }
}
