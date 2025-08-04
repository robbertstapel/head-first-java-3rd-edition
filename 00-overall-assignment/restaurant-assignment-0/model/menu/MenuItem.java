package model.menu;

public class MenuItem {
    int id;
    String name;
    double price;

    // Added constructor (cmd + n)
    public MenuItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Added getters for communication (cmd + n)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Added toString method (cmd +n)
    // We need this to override the default toString method.
    // If there is no override, Java inherits the toString method.
    // It inherits from Object, which is the parent of all classes.
    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
