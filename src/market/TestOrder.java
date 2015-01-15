package market;

import java.util.ArrayList;

/**
 * Created by @CAT-Caterpiller on 14.01.2015.
 */
public class TestOrder {
    public static void main(String[] args) {
        Customer you = new Customer(1000678, "lipa", "samsebeparol", "You");
        you.setBonus(13.75);

        Product book1 = new Product(256007, "Gulliver", 43.15, 8);
        Product book2 = new Product(256009, "Liliput", 65.00, 1);
        Product book3 = new Product(256067, "Buratino", 110.18, 2);
        Product book4 = new Product(213007, "Pinokkio", 12.78, 4);
        Product book5 = new Product(254007, "Oliver Tvist", 350.15, 2);

        Order order = new Order(357, you, new ArrayList<Product>());
        order.getBuy().add(book1);
        order.getBuy().add(book2);
        order.getBuy().add(book3);
        order.getBuy().add(book4);
        order.getBuy().add(book5);

        order.printOrder(115.12);

    }
}
