// /src/main/java/org/restaurant/items/Menu.java
package org.restaurant.items;
import java.util.List;

public class Menu {

    // A private constructor prevents the class from being instantiated.
    private Menu() {}

    private static final List<String> STARTERS = List.of(
            "1. Tomato Soup",
            "2. Caesar Salad",
            "3. Garlic Bread"
    );

    private static final List<String> MAIN_COURSES = List.of(
            "1. Grilled Steak",
            "2. Pasta Carbonara",
            "3. Veggie Burger"
    );

    private static final List<String> DESSERTS = List.of(
            "1. Chocolate Cake",
            "2. Apple Pie",
            "3. Ice Cream"
    );

    public static void display() {
        System.out.println("\n--- Restaurant Menu ---");
        System.out.println("\n-- STARTERS --");
        STARTERS.forEach(System.out::println);

        System.out.println("\n-- MAIN COURSES --");
        MAIN_COURSES.forEach(System.out::println);

        System.out.println("\n-- DESSERTS --");
        DESSERTS.forEach(System.out::println);
        System.out.println("-----------------------\n");
    }

    // Static "getters" to allow other classes to access the menu options for validation.
    public static List<String> getStarters() {
        return STARTERS;
    }

    public static List<String> getMainCourses() {
        return MAIN_COURSES;
    }

    public static List<String> getDesserts() {
        return DESSERTS;
    }
}