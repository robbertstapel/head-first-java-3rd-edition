// /src/main/java/org/restaurant/actors/Waitress.java
package org.restaurant.actors;

import org.restaurant.items.Menu; // Import the static Menu
import org.restaurant.items.Order;

import java.util.List;
import java.util.Scanner;

public class Waitress {
    private final String name;

    public Waitress(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void greetCustomer(Customer customer) {
        System.out.printf("Waitress %s: 'Welcome to our restaurant, %s!'\n", this.name, customer.getName());
    }

    public Order takeOrder(Customer customer, Scanner scanner) {
        System.out.printf("Waitress %s: 'Hello %s, here is our menu.'\n", this.name, customer.getName());
        Menu.display(); // Call the static display method directly on the class

        Order order = new Order();

        // Use a helper method to get a valid choice for each course
        String starter = selectCourse("starter", Menu.getStarters(), scanner);
        order.setStarter(starter);

        String mainCourse = selectCourse("main course", Menu.getMainCourses(), scanner);
        order.setMainCourse(mainCourse);

        String dessert = selectCourse("dessert", Menu.getDesserts(), scanner);
        order.setDessert(dessert);

        System.out.printf("\nWaitress %s: 'Excellent choices! I'll pass this to the chef.'\n", this.name);
        System.out.println("Order details: " + order);
        return order;
    }

    /**
     * A private helper method to handle the logic of selecting a dish from a list.
     * This avoids repeating the same code three times.
     *
     * @param courseName The name of the course (e.g., "starter") for the prompt.
     * @param options The list of available dishes for that course.
     * @param scanner The scanner to read user input.
     * @return The String of the chosen dish.
     */
    private String selectCourse(String courseName, List<String> options, Scanner scanner) {
        while (true) {
            System.out.printf("Please select a %s by number (1-%d):\n> ", courseName, options.size());
            String input = scanner.nextLine();
            try {
                int choice = Integer.parseInt(input);
                // User input is 1-based, but list indices are 0-based.
                if (choice >= 1 && choice <= options.size()) {
                    return options.get(choice - 1); // Return the chosen item string
                } else {
                    System.out.println("That number is not on the menu. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    public void serveMeal(Customer customer, Order meal) {
        System.out.printf("Waitress %s: 'Here is your meal, %s. Enjoy!'\n", this.name, customer.getName());
        customer.receiveMeal(meal);
    }
}