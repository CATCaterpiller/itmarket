package market;

/**
 * Created by @CAT-Caterpiller on 13.01.2015.
 */

/*
code - product code
name -
price -
amt - number of goods
 */

public class Product {
    private int code;
    private String name;
    private double price;
    private int amt;



    public Product() {}

    public Product(int code) {
        this.code = code;
    }

    public Product(int code, String name, double prise, int amt) {
        this.code = code;
        this.amt = amt;
        this.name = name;
        this.price = prise;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getAmt() {
        return amt;
    }
    public void setAmt(int amt) {
        this.amt = amt;
    }
    public int getCode() {

        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
}
