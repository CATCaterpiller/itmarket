package market;

import java.util.ArrayList;

/**
 * Created by @CAT-Caterpiller on 14.01.2015.
 */
public class Archive {
    private ArrayList<Product> products = new ArrayList<Product>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<Order> orders = new ArrayList<Order>();

    public static final Archive ARCHIVE = new Archive();

    private Archive(){}


    public Product getProduct(Product p) {
        Product result = null;
        for(Product x : products) {
            if(x.getName().equals(p.getName()) && x.getPrice()==p.getPrice()) result = x;

        }
        return result;
    }

    public Customer getCustomer(String login) {
        Customer result = null;
        for(Customer x : customers) {
            if(x.getLogin().equals(login)) result = x;
        }
        return result;
    }

    public Order getOrder(long code) {
        Order result = null;
        for(Order x : orders) {
            if(x.getCode() == code) result = x;
        }
        return result;
    }


    public void addProduct(Product p) {
        products.add(p);
    }
    public void addCustomer(Customer c) {
        customers.add(c);
    }
    public void addOrder(Order o) {
        orders.add(o);
    }


    public void remuveProduct(long code) {
        for(Product x : products) {
            if(x.getCode() == code) products.remove(x);
        }
    }
    public void remuveCustomer(long code) {
        for(Customer x : customers) {
            if(x.getCode() == code) customers.remove(x);
        }
    }
    public void remuveOrder(long code) {
        for(Order x : orders) {
            if(x.getCode() == code) orders.remove(x);
        }
    }
}
