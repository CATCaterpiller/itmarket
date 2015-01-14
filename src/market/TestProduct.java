package market;

/**
 * Created by @CAT-Caterpiller on 13.01.2015.
 */


public class TestProduct {
    public static void main(String[] args) {
        Product a = new Product();
        Product b = new Product(1);
        Product c = new Product(2, "Valenki", 13.95, 9);
        a=c;
        a.setName("tapki");
        a.setCode(b.getCode());
        System.out.println(a.getAmt());
        System.out.println(a.getCode());
        System.out.println(a.getName());
        System.out.println(a.getPrice());// TODO Auto-generated method stub

    }
}
