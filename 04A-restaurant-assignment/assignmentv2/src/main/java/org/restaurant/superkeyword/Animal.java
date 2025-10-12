package org.restaurant.superkeyword;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Animal {
    int age;
    String name;

    public void makeNoise(){
        System.out.println("Animal noise");
    }

    public void eat(){
        System.out.println("Animal eating");
    }
}
