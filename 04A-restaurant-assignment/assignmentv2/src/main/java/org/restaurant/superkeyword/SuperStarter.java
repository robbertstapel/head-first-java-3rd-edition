package org.restaurant.superkeyword;

public class SuperStarter {
    public static void main(String[] args) {
        Cat cat = new Cat(1, "Tommy", "fish");

        cat.makeNoise();
        cat.eat();
        System.out.println(cat.getAge() + " " + cat.getName() + " " + cat.getCatFood());
    }
}
