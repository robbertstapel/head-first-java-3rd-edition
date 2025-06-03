import actor.Waitress;
import model.menu.Menu;
import model.order.Order;

public class Application {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Waitress waitress = new Waitress(1, "Jessica");
        waitress.presentMenu(menu);

        Order orderOne = new Order(1);

        orderOne.getItems();
        orderOne.addItem(1);
        orderOne.addItem(2);
        orderOne.getItems();
    }
}