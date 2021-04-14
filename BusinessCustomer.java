public class BusinessCustomer extends Customer {

    private BusinessSize businessSize;

    public BusinessCustomer(String name, long ccNumber, BusinessSize businessSize) {
        super(name, ccNumber);
        this.businessSize = businessSize;
    }

    @Override
    public int calculateDiscount() {
        if (businessSize == BusinessSize.SMALL) {
            return 5;
        } else if (businessSize == BusinessSize.MEDIUM) {
            return 10;
        } else if (businessSize == BusinessSize.LARGE) {
            return 15;
        } else {
            return 0;
        }
    }
}
