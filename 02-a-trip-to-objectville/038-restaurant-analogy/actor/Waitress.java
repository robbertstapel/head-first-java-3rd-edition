package actor;
import model.menu.Menu;
import model.order.Order;

public class Waitress {
    int id;
    String name;

    public Waitress(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // The waitress needs to be able to see and "understand" the menu.
    // We have 3 fixed items on the menu, 1,2,3 which are starter main and dessert.
    public void presentMenu(Menu menu){
        menu.openMenu();
    }

    // Take order
//    public void takeOrder(Order order){
//        order.takeOrder();
//    }

    @Override
    public String toString() {
        return "Waitress{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}