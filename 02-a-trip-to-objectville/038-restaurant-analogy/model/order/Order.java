package model.order;
import java.util.ArrayList;
import java.util.List;

public class Order {
    int id;
    List<Integer> menuItemIds;

    public Order(int id) {
        this.id = id;
        this.menuItemIds = new ArrayList<>();
    }

    public void addItem(int itemId) {
        menuItemIds.add(itemId);
    }

    public List<Integer> getItems(){
        System.out.println(menuItemIds);
        return menuItemIds;
    }
}
