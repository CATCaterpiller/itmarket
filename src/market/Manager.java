package market;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by @CAT-Caterpiller on 15.01.2015.
 */
public class Manager {
    private Archive archive = Archive.ARCHIVE;
    private ArrayList<Long> listCodeProduct = new ArrayList<Long>();
    private ArrayList<String> listCodeCustomer = new ArrayList<String>();
    private ArrayList<Long> listCodeOrder = new ArrayList<Long>();
    private long codeProductGenerator = 1000000;
    private long codeCustomerGenerator = 2000000;
    private long codeOrderGenerator = 3000000;

    public static final Manager MANAGER = new Manager();

    private Manager() {}



    public void addProduct(Product p) {
        p.setCode(codeProductGenerator);
        listCodeProduct.add(codeProductGenerator);
        codeProductGenerator++;
        archive.addProduct(p);
    }

    public void addCustomer(String login, String password, String name) {
        Customer customer;
        for(String s : listCodeCustomer) {
            if(login.equals(s)) System.out.println("Takoy login uje est");
            else {
                customer = new Customer(codeCustomerGenerator, login, password, name);
                listCodeCustomer.add(login);
                codeCustomerGenerator++;
                archive.addCustomer(customer);
            }
        }

    }

    public Product getProduct(Product p) {
        return archive.getProduct(p);

    }

    public Customer getCustomer(String login, String password) {
        Customer temp = new Customer();
        temp =  archive.getCustomer(login);
        if(temp.getPassword().equals(password)) return null;
        else return temp;
    }

    public Order getOrder(long code) {
        return archive.getOrder(code);
    }

    public void newOrder(Customer c, ArrayList<Product> p) {
        double newBonus = 0;
        Order order = new Order(codeOrderGenerator, c, p);
        for(Product x : p) {
            Product temp = archive.getProduct(x);
            if(temp!=null && temp.getAmt()>=x.getAmt()) {
                temp.setAmt(temp.getAmt() - x.getAmt());
                newBonus += (x.getPrice()*x.getAmt()) / 20;
            } else if(temp!=null && temp.getAmt()<x.getAmt()) {
                System.out.println("malovato tovara");
                x.setAmt(temp.getAmt());
                temp.setAmt(temp.getAmt() - x.getAmt());
                newBonus += (x.getPrice()*x.getAmt()) / 20;
            } else {
                x = null;
                System.out.println("takogo tovara net");
            }

        }
        order.printOrder(newBonus);
        c.setBonus(newBonus);
        codeOrderGenerator++;
        archive.addOrder(order);
        c.getCustomerOrders().add(order);
    }








    public Archive getArchive() {
        return archive;
    }

    /*public long getCodeOrderGenerator() {
        return codeOrderGenerator;
    }
    public void setCodeOrderGenerator(long codeOrderGenerator) {
        this.codeOrderGenerator = codeOrderGenerator;
    }
    public long getCodeCustomerGenerator() {
        return codeCustomerGenerator;
    }
    public void setCodeCustomerGenerator(long codeCustomerGenerator) {
        this.codeCustomerGenerator = codeCustomerGenerator;
    }
    public long getCodeProductGenerator() {
        return codeProductGenerator;
    }
    public void setCodeProductGenerator(long codeProductGenerator) {
        this.codeProductGenerator = codeProductGenerator;
    }*/
}
