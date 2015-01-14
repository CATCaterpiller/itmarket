package market;


import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * Created by Admin on 13.01.2015.
 */
public class Order {
    private long code;
    private Customer buyer;
    private GregorianCalendar date;
    private ArrayList<Product> buy;
    private double sum = 0;


    public Order() {}

    public Order(long code, Customer buyer) {
        this.code = code;
        this.buyer = buyer;
        buy = new ArrayList<Product>();
        date = new GregorianCalendar();
        date.getTime();
    }



    void printOrder(double newBonus) {
        // SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy hh:mm");
        System.out.println(getDate());
        System.out.println();
        System.out.println(getCode());
        System.out.println();
        System.out.println("buyer name :" + getBuyer().getName() + "  -  " + "buyer id :" + getBuyer().getCode());
        System.out.println();
        for(Product x : getBuy()) {
            System.out.println("code: - " + x.getCode() + ", product: - " + x.getName() + "   -   amount - " + x.getAmt() + "  prise - " + x.getPrice() + "  sum - " + x.getAmt()*x.getPrice());
            sum += x.getAmt()*x.getPrice();
        }
        System.out.println();
        System.out.println("your bonus is - " + getBuyer().getBonus());
        System.out.println();
        System.out.println("the amount of your purchase - " + (getSum()-getBuyer().getBonus()));
        System.out.println();
        System.out.println();
        System.out.println("Your bonus will be with the next purchase  -  " + newBonus);

    }








    public long getCode() {
        return code;
    }
    public void setCode(long code) {
        this.code = code;
    }
    public Customer getBuyer() {
        return buyer;
    }
    public void setBuyer(Customer buyer) {
        this.buyer = buyer;
    }
    public GregorianCalendar getDate() {
        return date;
    }
    public void setDate(GregorianCalendar date) {
        this.date = date;
    }
    public ArrayList<Product> getBuy() {
        return buy;
    }
    public void setBuy(ArrayList<Product> buy) {
        this.buy = buy;
    }
    public double getSum() {
        return sum;
    }
    public void setSum(double sum) {
        this.sum = sum;
    }
}
