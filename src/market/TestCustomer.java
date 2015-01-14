package market;

/**
 * Created by Admin on 14.01.2015.
 */
public class TestCustomer {
    public static void main(String[] args) {
        Customer a = new Customer();
        Customer b = new Customer(373, "tpt", "ptrt", "Kolya");
        Customer c = new Customer(498, "ptp", "hffhgg", "Vasek");
        a=c;
        a.setCode(b.getCode());
        b.setName("Masha");
        a.setBonus(10.02);
        a.setName(b.getName());
        System.out.println(a.getBonus());
        System.out.println(a.getCode());
        System.out.println(a.getPassword());
        System.out.println(a.getName());


    }
}
