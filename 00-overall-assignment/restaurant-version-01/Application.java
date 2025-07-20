import actor.Waitress;
import model.menu.Menu;
import model.order.Order;

public class Application {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Order order = new Order(1);

        Waitress waitress = new Waitress(1, "Jessica");
        waitress.presentMenu(menu);

        order.addItem(1);
        order.addItem(2);
        Waitress.takeOrder(1, order.getItems());
    }
}