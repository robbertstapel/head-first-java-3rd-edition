package model.menu;

class MenuItem {
    int id;
    String name;
    double price;

    // constructor
    MenuItem (int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

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
