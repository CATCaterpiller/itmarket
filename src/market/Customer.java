package market;

import java.util.ArrayList;

/**
 * Created by @CAT-Caterpiller on 13.01.2015.
 */

/*
key - individual code
login - individual
password
name
bonus
ListBuy

 */
public class Customer {
    private long key;
    private String login;
    private String password;
    private String name;
    private double bonus;
    private ArrayList<Order> customerOrders;

    public Customer() {}

    public Customer(int key, String login, String password, String name) {
        this.key = key;
        this.login = login;
        this.password = password;
        this.name = name;
        customerOrders = new ArrayList<Order>();
    }







    public long getKey() {
        return key;
    }
    public void setKey(long key) {
        this.key = key;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public ArrayList<Order> getCustomerOrders() {
        return customerOrders;
    }
    public void setCustomerOrders(ArrayList<Order> customerOrders) {
        this.customerOrders = customerOrders;
    }
}
