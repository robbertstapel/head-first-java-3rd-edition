import actor.Waitress;
import model.menu.Menu;

public class Application {
    public static void main(String[] args) {
        Menu testMenu = new Menu();

        Waitress waitress = new Waitress(1, "Jessica");
        waitress.presentMenu(testMenu);
    }
}