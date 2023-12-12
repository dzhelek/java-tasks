package lab8;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static class Item {
        String name;
        double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    List<Item> items = new ArrayList<>();

    void addItem(Item item) {
        items.add(item);
    }

    double getTotal() {
        double sum = 0;
        for(var item : items) {
            sum += item.price;
        }
        return sum;
    }

    public static void main(String[] args) {
        var cart = new ShoppingCart();
        cart.addItem(new ShoppingCart.Item("Мляко", 2.99));
        var total = cart.getTotal(); // Сумира цените на всички продукти
        System.out.println(total);
    }
}
