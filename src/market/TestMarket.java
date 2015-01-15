package market;

import java.util.ArrayList;

/**
 * Created by @CAT-Caterpiller on 15.01.2015.
 */

/*
тест маркета и всех классов:
- создаем лист товаров из 10 единицж
- создаем 3х юзеров
- делаем метод проверки входа юзеров
- проверяем юзеров на входе и делаем покупки
- делаем покупки
 */
public class TestMarket {
    private static Manager manager = Manager.MANAGER;

    public static void main(String[] args) {
        manager.addProduct(new Product("Tapki", 15.50, 20));
        manager.addProduct(new Product("Valenki", 25.35, 30));
        manager.addProduct(new Product("Liji", 389.43, 10));
        manager.addProduct(new Product("Kedi", 73.20, 15));
        manager.addProduct(new Product("Shlepki", 33.33, 70));
        manager.addProduct(new Product("Tapki", 45.50, 20));
        manager.addProduct(new Product("Valenki", 65.35, 30));
        manager.addProduct(new Product("Liji", 199.43, 10));
        manager.addProduct(new Product("Kedi", 124.20, 15));
        manager.addProduct(new Product("Shlepki", 933.33, 70));

        manager.addCustomer("lol", "superlol", "Vasya");
        manager.addCustomer("nobel", "superlol", "Nobel");
        manager.addCustomer("lena", "superlol", "Lena");

        Customer temp1 = manager.getCustomer("lol", "superlol");
        Customer temp2 = manager.getCustomer("nobel", "super");
        Customer temp3 = manager.getCustomer("lena", "superlol");

        if(entryCustomer(temp1.getLogin(), temp1.getPassword())) {
            ArrayList<Product> temp = new ArrayList<Product>();
            temp.add(new Product("Valenki", 25.35, 10));
            temp.add(new Product("Shlepki", 33.33, 30));
            temp.add(new Product("Liji", 199.43, 1));

            manager.newOrder(temp1, temp);
        }

        if(entryCustomer(temp2.getLogin(), temp2.getPassword())) {
            ArrayList<Product> temp = new ArrayList<Product>();
            temp.add(new Product("Valenki", 25.35, 10));
            temp.add(new Product("Shlepki", 33.33, 30));
            temp.add(new Product("Liji", 199.43, 1));

            manager.newOrder(temp2, temp);
        }

        if(entryCustomer(temp3.getLogin(), temp3.getPassword())) {
            ArrayList<Product> temp = new ArrayList<Product>();
            temp.add(new Product("Kedi", 124.20, 12));
            temp.add(new Product("Shlepki", 933.33, 1));
            temp.add(new Product("Tapki", 15.50, 22));

            manager.newOrder(temp3, temp);
        }


    }

    public static boolean entryCustomer(String login, String password) {
        Customer temp = manager.getCustomer(login, password);
        if(temp != null) return true;
        else return false;
    }
}
