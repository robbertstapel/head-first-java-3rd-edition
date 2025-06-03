package reference;

public class DogArray {
    public static void main(String[] args) {
        Dog[] pets = new Dog[3];

        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[2] = pets[1];

        System.out.println(pets);
        System.out.println(pets.getClass());
        // LDog; List of Dog Objects?
        // Second part is just the object reference

        pets[2].name = "Fido";

        System.out.println(pets[2].name);
        pets[2].bark();
        pets[2].eat();
        pets[2].chaseCat();

        System.out.println(pets[1].name); // we set name via copy pets[2] which is the same object

    }
}
