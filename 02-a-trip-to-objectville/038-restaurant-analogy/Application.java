import actor.Waitress;
import model.menu.Menu;
import model.order.Order;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Waitress waitress = new Waitress(1, "Jessica");
        waitress.presentMenu(menu);

        Order orderOne = new Order(1, Arrays.asList(0,1,2));
        orderOne.getItems();
    }
}