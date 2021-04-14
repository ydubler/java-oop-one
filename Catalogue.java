
//import java.util.HashMap;
import java.util.Map;

public class Catalogue {

    public final static int SHIPPING_RATE = 3;

    private static Map<String, Product> productMap = Map.of("Frisbee",
            new Product("Frisbee", ProductType.PHYSICAL, 3599, 2), "Golf Club",
            new Product("Golf Club", ProductType.PHYSICAL, 5999, 7), "Lightbulb",
            new Product("Lightbulb", ProductType.PHYSICAL, 499, 0), "Microsoft Word",
            new Product("Microsoft Word", ProductType.DIGITAL, 3999, -1));

    // Another way to initialize productMap using a static initializer:
    // private static Map<String, Product> productMap = new HashMap<>();

    /* Static Initializer */
    // static {
    // productMap.put("Frisbee", new Product("Frisbee", 3599));
    // productMap.put("Golf Club", new Product("Golf Club", 5999));
    // productMap.put("Lightbulb", new Product("Lightbulb", 3599));
    // }

    public static Product getProduct(String name) {
        return productMap.get(name);
    }

}
