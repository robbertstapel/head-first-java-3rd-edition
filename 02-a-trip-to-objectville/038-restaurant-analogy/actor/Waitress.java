package actor;
import model.menu.Menu;

public class Waitress {
    int id;
    String name;

    public Waitress(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // The waitress needs to be able to see and "understand" the menu.
    // We have 3 fixed items on the menu, 1,2,3 which are starter main and dessert.
    public void presentMenu(Menu menu) {
        System.out.println(this.name + " says: \"Hello! Here is our menu:\"");
        menu.openMenu();
        System.out.println(this.name + " says: \"Let me know when you're ready to order.\"");
    }

    @Override
    public String toString() {
        return "Waitress{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}