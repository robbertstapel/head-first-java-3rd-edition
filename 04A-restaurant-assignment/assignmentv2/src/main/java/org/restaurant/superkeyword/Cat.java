package org.restaurant.superkeyword;

import lombok.Getter;

@Getter
public class Cat extends Animal{
    String catFood;

    // constructor
    public Cat(int age, String name, String catFood){
        // call super class constructor for age and name
        super(age, name);
        this.catFood = catFood;
    }

    @Override
    public void makeNoise(){
        super.makeNoise();
        System.out.println("Meow");
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("Cat eating");
    }

}
