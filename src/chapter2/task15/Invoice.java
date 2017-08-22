package chapter2.task15;

/*Реализуйте полностью класс Invoice, представленный в разделе 2.6.1.
 Предоставьте метод, выводящий счет-фактуру, и демонстрационную версию программмы, составляющей и выводящей образец счета-фактуры.*/

/*Пропустить*/
import java.util.ArrayList;

public class Invoice {
    private static class Item { // Элемент вложен внутри счета-фактуры
        String description;
        int quantity;
        double unitPrice;

        double price() { return quantity * unitPrice; }
        public String toString() {
            return quantity + " x " + description + " @ $" + unitPrice + " each";
        }
    }

    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String description, int quantity, double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }

    public void print() {
        double total = 0;
        for (Item item : items) {
            System.out.println(item);
            total += item.price();
        }
        System.out.println(total);
    }

    public static void main(String[] args) {

    }

}
