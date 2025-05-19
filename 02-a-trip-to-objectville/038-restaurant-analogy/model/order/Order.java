package model.order;
import java.util.List;

public class Order {
    int id;
    List<Integer> items;

    public Order(int id, List<Integer> items) {
        this.id = id;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void getItems() {
        System.out.println(items);
    }
}
