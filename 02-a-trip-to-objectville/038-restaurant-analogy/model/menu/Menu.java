package model.menu;

import java.util.ArrayList;
import java.util.List;

// A menu is just a list of menu items.
// It's function (method) is to show you the menu.
// Therefore, you can open and close the menu.
public class Menu {
    List<MenuItem> menuItems;

    public Menu() {
        menuItems = new ArrayList<>(); // type inference from above, it knows menuItems's type.
        menuItems.add(new MenuItem(1, "Starter", 10.00));
        menuItems.add(new MenuItem(2, "Main", 30.00));
        menuItems.add(new MenuItem(3, "Dessert", 15.00));
    }

    public void openMenu() {
        System.out.println("--------- MENU --------");
        for (MenuItem menuItem : menuItems) {
            System.out.print(menuItem.id);
            System.out.print(" - ");
            System.out.println(menuItem.name);
        }
        System.out.println("-----------------------");
    }


}
